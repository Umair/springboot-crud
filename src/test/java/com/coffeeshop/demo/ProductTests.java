package com.coffeeshop.demo;

import com.coffeeshop.demo.model.Product;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTests {
    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Product product = new Product("Americano",5.1);

        // then
        assertThat(product.getProductName()).isEqualTo("Americano");
    }
}
