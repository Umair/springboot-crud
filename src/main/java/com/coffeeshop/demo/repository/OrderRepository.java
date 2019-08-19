package com.coffeeshop.demo.repository;

import com.coffeeshop.demo.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}
