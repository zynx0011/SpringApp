package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Search products by name (case-insensitive)
    List<Product> findByNameContainingIgnoreCase(String keyword);

    // Find a product by exact name
    Product findByName(String name);

    // Advanced search by category and price range
    List<Product> findByCategoryIgnoreCaseAndPriceBetween(String category, double minPrice, double maxPrice);

}
