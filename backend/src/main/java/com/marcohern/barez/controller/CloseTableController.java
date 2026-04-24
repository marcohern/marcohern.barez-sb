package com.marcohern.barez.controller;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.dto.response.ReceiptResponse;
import com.marcohern.barez.service.impl.TableCloseServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tables")
@PreAuthorize("hasAnyRole('MANAGER','WAITER')")
public class CloseTableController {

    private final TableCloseServiceImpl tableCloseService;

    public CloseTableController(TableCloseServiceImpl tableCloseService) {
        this.tableCloseService = tableCloseService;
    }

    @PostMapping("/{tableId}/close")
    public ResponseEntity<ReceiptResponse> closeTable(@PathVariable Long tableId, Authentication auth) {
        Long callerId = ((User) auth.getPrincipal()).getId();
        return ResponseEntity.ok(tableCloseService.closeTable(tableId, callerId));
    }
}
