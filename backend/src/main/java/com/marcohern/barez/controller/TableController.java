package com.marcohern.barez.controller;

import com.marcohern.barez.dto.request.CreateTableRequest;
import com.marcohern.barez.dto.response.TableResponse;
import com.marcohern.barez.service.impl.TableServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tables")
public class TableController {

    private final TableServiceImpl tableService;

    public TableController(TableServiceImpl tableService) {
        this.tableService = tableService;
    }

    @PostMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<TableResponse> create(@Valid @RequestBody CreateTableRequest req) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tableService.createTable(req));
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('MANAGER','WAITER')")
    public ResponseEntity<List<TableResponse>> list() {
        return ResponseEntity.ok(tableService.getAllTables());
    }
}
