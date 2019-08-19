package com.coffeeshop.demo.repository;

import com.coffeeshop.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
