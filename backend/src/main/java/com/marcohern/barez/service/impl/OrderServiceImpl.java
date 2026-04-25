package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.*;
import com.marcohern.barez.domain.enums.OrderStatus;
import com.marcohern.barez.domain.enums.Role;
import com.marcohern.barez.dto.request.AddItemRequest;
import com.marcohern.barez.dto.response.OrderItemResponse;
import com.marcohern.barez.dto.response.OrderResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.*;
import com.marcohern.barez.service.OrderService;
import com.marcohern.barez.service.ShiftService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderItemRepository itemRepository;
    private final BarTableRepository tableRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final TableAssignmentRepository assignmentRepository;
    private final ShiftService shiftService;

    public OrderServiceImpl(OrderRepository orderRepository,
                            OrderItemRepository itemRepository,
                            BarTableRepository tableRepository,
                            UserRepository userRepository,
                            ProductRepository productRepository,
                            TableAssignmentRepository assignmentRepository,
                            ShiftService shiftService) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
        this.tableRepository = tableRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.assignmentRepository = assignmentRepository;
        this.shiftService = shiftService;
    }

    @Transactional
    public OrderResponse startOrder(Long tableId, Long requesterId) {
        WorkShift shift = shiftService.getCurrentOpenShiftEntity();
        BarTable table = findTableOrThrow(tableId);

        if (!assignmentRepository.existsByTableAndShift(table, shift))
            throw ApiException.badRequest("Table is not assigned in the current shift");

        if (orderRepository.findByTableAndShiftAndStatus(table, shift, OrderStatus.OPEN).isPresent())
            throw ApiException.conflict("An open order already exists for this table");

        return OrderResponse.from(orderRepository.save(new Order(table, shift)));
    }

    @Transactional
    public OrderItemResponse addItem(Long orderId, AddItemRequest req, Long requesterId) {
        Order order = findOpenOrderOrThrow(orderId);
        checkAccess(order, requesterId);

        Product product = productRepository.findById(req.productId())
                .orElseThrow(() -> ApiException.notFound("Product not found"));

        if (!product.isActive()) throw ApiException.badRequest("Product is not available");

        OrderItem item = new OrderItem(order, product, req.quantity());
        return OrderItemResponse.from(itemRepository.save(item));
    }

    @Transactional
    public void removeItem(Long orderId, Long itemId, Long requesterId) {
        Order order = findOpenOrderOrThrow(orderId);
        checkAccess(order, requesterId);

        OrderItem item = itemRepository.findById(itemId)
                .orElseThrow(() -> ApiException.notFound("Item not found"));

        if (!item.getOrder().getId().equals(orderId))
            throw ApiException.badRequest("Item does not belong to this order");

        itemRepository.delete(item);
    }

    public OrderResponse getOrder(Long orderId, Long requesterId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> ApiException.notFound("Order not found"));
        checkAccess(order, requesterId);
        return OrderResponse.from(order);
    }

    private Order findOpenOrderOrThrow(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> ApiException.notFound("Order not found"));
        if (order.getStatus() != OrderStatus.OPEN) throw ApiException.badRequest("Order is already closed");
        return order;
    }

    private void checkAccess(Order order, Long requesterId) {
        User requester = userRepository.findById(requesterId)
                .orElseThrow(() -> ApiException.notFound("User not found"));

        if (requester.getRole() == Role.MANAGER) return;

        WorkShift shift = order.getShift();
        BarTable table = order.getTable();
        assignmentRepository.findByTableAndShift(table, shift)
                .filter(ta -> ta.getWaiter().getId().equals(requesterId))
                .orElseThrow(() -> ApiException.forbidden("You are not assigned to this table"));
    }

    private BarTable findTableOrThrow(Long id) {
        return tableRepository.findById(id).orElseThrow(() -> ApiException.notFound("Table not found"));
    }
}
