package com.example.cartservices.services;

import com.example.cartservices.dtos.FakeStoreProductDto;
import com.example.cartservices.models.product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements getAllCart {
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<FakeStoreProductDto> getAllCart(){
        FakeStoreProductDto[] response = restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                FakeStoreProductDto[].class
        );
        return List.of(response);
    }
    @Override
    public FakeStoreProductDto getSingleCart(Long id) {
        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity(
                "https://fakestoreapi.com/carts/" + id,
                FakeStoreProductDto.class
        );
        FakeStoreProductDto fakeStoreProductDto = response.getBody();
        return fakeStoreProductDto;
//        product Product = new product();
//        return Product;
    }

}
