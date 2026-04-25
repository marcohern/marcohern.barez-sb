package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.Product;
import com.marcohern.barez.dto.request.CreateProductRequest;
import com.marcohern.barez.dto.request.UpdateProductRequest;
import com.marcohern.barez.dto.response.ProductResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.ProductRepository;
import com.marcohern.barez.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse createProduct(CreateProductRequest req) {
        Product p = new Product(req.name(), req.description(), req.price(), req.category());
        return ProductResponse.from(productRepository.save(p));
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(ProductResponse::from).toList();
    }

    public List<ProductResponse> getActiveProducts() {
        return productRepository.findAllByActiveTrue().stream().map(ProductResponse::from).toList();
    }

    public ProductResponse updateProduct(Long id, UpdateProductRequest req) {
        Product p = productRepository.findById(id).orElseThrow(() -> ApiException.notFound("Product not found"));
        p.setName(req.name());
        p.setDescription(req.description());
        p.setPrice(req.price());
        p.setCategory(req.category());
        p.setActive(req.active());
        return ProductResponse.from(productRepository.save(p));
    }

    public Product findOrThrow(Long id) {
        return productRepository.findById(id).orElseThrow(() -> ApiException.notFound("Product not found"));
    }
}
