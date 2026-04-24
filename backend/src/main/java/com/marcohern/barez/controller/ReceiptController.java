package com.marcohern.barez.controller;

import com.marcohern.barez.service.impl.ReceiptServiceImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receipts")
@PreAuthorize("hasAnyRole('MANAGER','WAITER')")
public class ReceiptController {

    private final ReceiptServiceImpl receiptService;

    public ReceiptController(ReceiptServiceImpl receiptService) {
        this.receiptService = receiptService;
    }

    @GetMapping("/{receiptId}/pdf")
    public ResponseEntity<byte[]> getPdf(@PathVariable Long receiptId) {
        byte[] pdf = receiptService.getPdfBytes(receiptId);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=receipt-" + receiptId + ".pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }
}
