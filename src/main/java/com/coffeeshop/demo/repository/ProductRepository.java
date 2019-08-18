package com.coffeeshop.demo.repository;

import com.coffeeshop.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
}
