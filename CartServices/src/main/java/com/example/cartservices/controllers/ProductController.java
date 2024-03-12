package com.example.cartservices.controllers;

import com.example.cartservices.dtos.FakeStoreProductDto;
import com.example.cartservices.models.product;
import com.example.cartservices.services.getAllCart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private getAllCart productService;

    public ProductController(getAllCart productService) {
        this.productService = productService;
    }

    @GetMapping("/carts")
    public List<FakeStoreProductDto> getAllCart(){
        List<FakeStoreProductDto> fakeStoreProductDtos = productService.getAllCart();
        return fakeStoreProductDtos;
    }

    @GetMapping("/carts/{id}")
    public FakeStoreProductDto getSingleCart(@PathVariable("id") Long id) {
        return productService.getSingleCart(id);
    }
}
