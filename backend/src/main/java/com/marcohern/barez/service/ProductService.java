package com.marcohern.barez.service;

import com.marcohern.barez.domain.entity.Product;
import com.marcohern.barez.dto.request.CreateProductRequest;
import com.marcohern.barez.dto.request.UpdateProductRequest;
import com.marcohern.barez.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(CreateProductRequest req);
    List<ProductResponse> getAllProducts();
    List<ProductResponse> getActiveProducts();
    ProductResponse updateProduct(Long id, UpdateProductRequest req);
    Product findOrThrow(Long id);
}
