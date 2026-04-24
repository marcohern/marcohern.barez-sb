package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.BarTable;
import com.marcohern.barez.dto.request.CreateTableRequest;
import com.marcohern.barez.dto.response.TableResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.BarTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl {

    private final BarTableRepository tableRepository;

    public TableServiceImpl(BarTableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public TableResponse createTable(CreateTableRequest req) {
        if (tableRepository.existsByTableNumber(req.tableNumber()))
            throw ApiException.conflict("Table number already exists");

        return TableResponse.from(tableRepository.save(new BarTable(req.tableNumber())));
    }

    public List<TableResponse> getAllTables() {
        return tableRepository.findAllByActiveTrue().stream().map(TableResponse::from).toList();
    }

    public BarTable findOrThrow(Long id) {
        return tableRepository.findById(id).orElseThrow(() -> ApiException.notFound("Table not found"));
    }
}
