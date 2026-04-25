package com.marcohern.barez.service;

import com.marcohern.barez.dto.response.ReceiptResponse;

public interface TableCloseService {
    ReceiptResponse closeTable(Long tableId, Long requesterId);
}
