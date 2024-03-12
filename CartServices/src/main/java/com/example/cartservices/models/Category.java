package com.example.cartservices.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long id;
    private Long userld;
    private String date;
    private Category product;
}
