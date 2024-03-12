package com.example.cartservices.dtos;

import com.example.cartservices.models.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private int userld;
    private String date;
    private String product;
}
