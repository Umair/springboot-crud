package com.coffeeshop.demo;

import com.coffeeshop.demo.model.Product;
import com.coffeeshop.demo.repository.CustomerRepository;
import com.coffeeshop.demo.repository.OrderRepository;
import com.coffeeshop.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void run(String... strings) throws Exception {

        Product mocha = new Product();
        mocha.setProductName("Mocha");
        mocha.setProductPrice(3.95);

        Product capuccinno = new Product();
        capuccinno.setProductName("Capuccinno");
        capuccinno.setProductPrice(4.95);

        productRepository.save(mocha);
        productRepository.save(capuccinno);


    }
}
