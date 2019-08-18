package com.coffeeshop.demo.repository;

import com.coffeeshop.demo.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<CustomerOrder, Long> {
}
