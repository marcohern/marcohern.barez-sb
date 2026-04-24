package com.marcohern.barez.controller;

import com.marcohern.barez.dto.request.CreateProductRequest;
import com.marcohern.barez.dto.request.UpdateProductRequest;
import com.marcohern.barez.dto.response.ProductResponse;
import com.marcohern.barez.service.impl.ProductServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<ProductResponse> create(@Valid @RequestBody CreateProductRequest req) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(req));
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('MANAGER','WAITER')")
    public ResponseEntity<List<ProductResponse>> list(@RequestParam(required = false) Boolean active) {
        if (Boolean.TRUE.equals(active)) return ResponseEntity.ok(productService.getActiveProducts());
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @Valid @RequestBody UpdateProductRequest req) {
        return ResponseEntity.ok(productService.updateProduct(id, req));
    }
}
