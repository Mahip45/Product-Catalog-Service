
package com.example.productcatalog.controller;

import com.example.productcatalog.model.Product;
import com.example.productcatalog.repository.ProductRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@Tag(name = "Product API")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private final ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product) {
        logger.info("Creating product: {}", product);
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        logger.info("Fetching all products");
        return productRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        productRepository.deleteById(id);
        logger.info("Deleted product with id: {}", id);
        return ResponseEntity.noContent().build();
    }
}
