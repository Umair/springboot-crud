package com.coffeeshop.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.Matchers.hasSize;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.reset;
//import static org.mockito.Mockito.verify;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductServiceTest {

    //    @Test
//    public void givenProducts_whenGetProducts_thenReturnJsonArray()
//            throws Exception {
//
//        Product coffee = new Product("Americano",5.5);
//
//        List<Product> allProducts = Arrays.asList(coffee);
//
//        Mockito.when(productRepository.findAll()).thenReturn(allProducts);
//        given(service.findAll()).willReturn(allProducts);
//
//        mvc1.perform(get("api/v1/productss")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].name", is(coffee.getProductName())));
//    }
}
