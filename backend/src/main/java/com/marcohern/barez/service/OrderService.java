package com.marcohern.barez.service;

import com.marcohern.barez.dto.request.AddItemRequest;
import com.marcohern.barez.dto.response.OrderItemResponse;
import com.marcohern.barez.dto.response.OrderResponse;

public interface OrderService {
    OrderResponse startOrder(Long tableId, Long requesterId);
    OrderItemResponse addItem(Long orderId, AddItemRequest req, Long requesterId);
    void removeItem(Long orderId, Long itemId, Long requesterId);
    OrderResponse getOrder(Long orderId, Long requesterId);
}
