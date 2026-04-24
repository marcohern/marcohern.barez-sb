package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.Receipt;
import com.marcohern.barez.dto.response.ReceiptResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.ReceiptRepository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Service
public class ReceiptServiceImpl {

    private final ReceiptRepository receiptRepository;

    public ReceiptServiceImpl(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public byte[] getPdfBytes(Long receiptId) {
        Receipt receipt = findOrThrow(receiptId);
        if (receipt.getPdfPath() == null) throw ApiException.notFound("PDF not yet generated");

        File file = new File(receipt.getPdfPath());
        if (!file.exists()) throw ApiException.notFound("PDF file not found on server");

        try {
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException("Failed to read PDF", e);
        }
    }

    public ReceiptResponse getReceipt(Long receiptId) {
        return ReceiptResponse.from(findOrThrow(receiptId));
    }

    private Receipt findOrThrow(Long id) {
        return receiptRepository.findById(id).orElseThrow(() -> ApiException.notFound("Receipt not found"));
    }
}
