package com.marcohern.barez.service;

import com.marcohern.barez.domain.entity.Product;
import com.marcohern.barez.dto.request.CreateProductRequest;
import com.marcohern.barez.dto.request.UpdateProductRequest;
import com.marcohern.barez.dto.response.ProductResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.ProductRepository;
import com.marcohern.barez.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    private Product beer;

    @BeforeEach
    void setUp() {
        beer = new Product("Beer", "Cold beer", new BigDecimal("3.50"), "Drinks");
        setId(beer, 1L);
    }

    // Helper: reflectively set the id field since there's no setter
    private void setId(Product p, Long id) {
        try {
            var field = Product.class.getDeclaredField("id");
            field.setAccessible(true);
            field.set(p, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void createProduct_savesAndReturnsResponse() {
        CreateProductRequest req = new CreateProductRequest("Beer", "Cold beer", new BigDecimal("3.50"), "Drinks");
        when(productRepository.save(any(Product.class))).thenReturn(beer);

        ProductResponse response = productService.createProduct(req);

        assertThat(response.id()).isEqualTo(1L);
        assertThat(response.name()).isEqualTo("Beer");
        assertThat(response.price()).isEqualByComparingTo("3.50");
        assertThat(response.active()).isTrue();
        verify(productRepository).save(any(Product.class));
    }

    @Test
    void getAllProducts_returnsMappedList() {
        Product wine = new Product("Wine", "Red wine", new BigDecimal("5.00"), "Drinks");
        setId(wine, 2L);
        when(productRepository.findAll()).thenReturn(List.of(beer, wine));

        List<ProductResponse> result = productService.getAllProducts();

        assertThat(result).hasSize(2);
        assertThat(result).extracting(ProductResponse::name).containsExactly("Beer", "Wine");
    }

    @Test
    void getActiveProducts_returnsOnlyActive() {
        when(productRepository.findAllByActiveTrue()).thenReturn(List.of(beer));

        List<ProductResponse> result = productService.getActiveProducts();

        assertThat(result).hasSize(1);
        assertThat(result.get(0).name()).isEqualTo("Beer");
    }

    @Test
    void updateProduct_updatesAndReturnsResponse() {
        UpdateProductRequest req = new UpdateProductRequest("Premium Beer", "Import beer", new BigDecimal("4.50"), "Drinks", true);
        Product updated = new Product("Premium Beer", "Import beer", new BigDecimal("4.50"), "Drinks");
        setId(updated, 1L);

        when(productRepository.findById(1L)).thenReturn(Optional.of(beer));
        when(productRepository.save(any(Product.class))).thenReturn(updated);

        ProductResponse response = productService.updateProduct(1L, req);

        assertThat(response.name()).isEqualTo("Premium Beer");
        assertThat(response.price()).isEqualByComparingTo("4.50");
    }

    @Test
    void updateProduct_throwsNotFound_whenProductMissing() {
        UpdateProductRequest req = new UpdateProductRequest("X", null, new BigDecimal("1.00"), null, true);
        when(productRepository.findById(99L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> productService.updateProduct(99L, req))
                .isInstanceOf(ApiException.class)
                .hasMessage("Product not found")
                .satisfies(ex -> assertThat(((ApiException) ex).getStatus()).isEqualTo(HttpStatus.NOT_FOUND));
    }

    @Test
    void findOrThrow_returnsProduct_whenFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.of(beer));

        Product result = productService.findOrThrow(1L);

        assertThat(result).isEqualTo(beer);
    }

    @Test
    void findOrThrow_throwsNotFound_whenMissing() {
        when(productRepository.findById(42L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> productService.findOrThrow(42L))
                .isInstanceOf(ApiException.class)
                .hasMessage("Product not found")
                .satisfies(ex -> assertThat(((ApiException) ex).getStatus()).isEqualTo(HttpStatus.NOT_FOUND));
    }
}
