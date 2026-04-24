package com.marcohern.barez.controller;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.dto.request.AddItemRequest;
import com.marcohern.barez.dto.response.OrderItemResponse;
import com.marcohern.barez.dto.response.OrderResponse;
import com.marcohern.barez.service.impl.OrderServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@PreAuthorize("hasAnyRole('MANAGER','WAITER')")
public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/tables/{tableId}/orders")
    public ResponseEntity<OrderResponse> startOrder(@PathVariable Long tableId, Authentication auth) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.startOrder(tableId, currentUserId(auth)));
    }

    @PostMapping("/api/orders/{orderId}/items")
    public ResponseEntity<OrderItemResponse> addItem(@PathVariable Long orderId,
                                                      @Valid @RequestBody AddItemRequest req,
                                                      Authentication auth) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.addItem(orderId, req, currentUserId(auth)));
    }

    @DeleteMapping("/api/orders/{orderId}/items/{itemId}")
    public ResponseEntity<Void> removeItem(@PathVariable Long orderId, @PathVariable Long itemId, Authentication auth) {
        orderService.removeItem(orderId, itemId, currentUserId(auth));
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/api/orders/{orderId}")
    public ResponseEntity<OrderResponse> getOrder(@PathVariable Long orderId, Authentication auth) {
        return ResponseEntity.ok(orderService.getOrder(orderId, currentUserId(auth)));
    }

    private Long currentUserId(Authentication auth) {
        return ((User) auth.getPrincipal()).getId();
    }
}
