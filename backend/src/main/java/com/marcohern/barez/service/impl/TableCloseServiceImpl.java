package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.*;
import com.marcohern.barez.domain.enums.OrderStatus;
import com.marcohern.barez.domain.enums.Role;
import com.marcohern.barez.domain.enums.TableStatus;
import com.marcohern.barez.dto.response.ReceiptResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.pdf.PdfReceiptService;
import com.marcohern.barez.repository.*;
import com.marcohern.barez.service.ShiftService;
import com.marcohern.barez.service.TableCloseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class TableCloseServiceImpl implements TableCloseService {

    private final BarTableRepository tableRepository;
    private final TableAssignmentRepository assignmentRepository;
    private final OrderRepository orderRepository;
    private final ReceiptRepository receiptRepository;
    private final UserRepository userRepository;
    private final ShiftService shiftService;
    private final PdfReceiptService pdfReceiptService;

    public TableCloseServiceImpl(BarTableRepository tableRepository,
                                 TableAssignmentRepository assignmentRepository,
                                 OrderRepository orderRepository,
                                 ReceiptRepository receiptRepository,
                                 UserRepository userRepository,
                                 ShiftService shiftService,
                                 PdfReceiptService pdfReceiptService) {
        this.tableRepository = tableRepository;
        this.assignmentRepository = assignmentRepository;
        this.orderRepository = orderRepository;
        this.receiptRepository = receiptRepository;
        this.userRepository = userRepository;
        this.shiftService = shiftService;
        this.pdfReceiptService = pdfReceiptService;
    }

    @Transactional
    public ReceiptResponse closeTable(Long tableId, Long requesterId) {
        BarTable table = tableRepository.findById(tableId)
                .orElseThrow(() -> ApiException.notFound("Table not found"));

        WorkShift shift = shiftService.getCurrentOpenShiftEntity();
        User requester = userRepository.findById(requesterId)
                .orElseThrow(() -> ApiException.notFound("User not found"));

        if (requester.getRole() == Role.WAITER) {
            assignmentRepository.findByTableAndShift(table, shift)
                    .filter(ta -> ta.getWaiter().getId().equals(requesterId))
                    .orElseThrow(() -> ApiException.forbidden("You are not assigned to this table"));
        }

        Order order = orderRepository.findByTableAndShiftAndStatus(table, shift, OrderStatus.OPEN)
                .orElseThrow(() -> ApiException.badRequest("No open order for this table"));

        BigDecimal total = order.getItems().stream()
                .map(OrderItem::lineTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        order.setStatus(OrderStatus.CLOSED);
        order.setClosedAt(LocalDateTime.now());
        orderRepository.save(order);

        Receipt receipt = new Receipt(order, total);
        receipt = receiptRepository.save(receipt);

        String pdfPath = pdfReceiptService.generateReceiptPdf(order, receipt);
        receipt.setPdfPath(pdfPath);
        receiptRepository.save(receipt);

        table.setStatus(TableStatus.AVAILABLE);
        tableRepository.save(table);

        return ReceiptResponse.from(receipt);
    }
}
