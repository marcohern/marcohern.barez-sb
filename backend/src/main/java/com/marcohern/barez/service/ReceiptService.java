package com.marcohern.barez.service;

import com.marcohern.barez.dto.response.ReceiptResponse;

public interface ReceiptService {
    byte[] getPdfBytes(Long receiptId);
    ReceiptResponse getReceipt(Long receiptId);
}
