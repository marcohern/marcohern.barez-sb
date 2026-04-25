package com.marcohern.barez.service;

import com.marcohern.barez.domain.entity.BarTable;
import com.marcohern.barez.dto.request.CreateTableRequest;
import com.marcohern.barez.dto.response.TableResponse;

import java.util.List;

public interface TableService {
    TableResponse createTable(CreateTableRequest req);
    List<TableResponse> getAllTables();
    BarTable findOrThrow(Long id);
}
