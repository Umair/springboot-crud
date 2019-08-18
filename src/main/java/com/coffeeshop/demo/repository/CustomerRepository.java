package com.coffeeshop.demo.repository;

import com.coffeeshop.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
