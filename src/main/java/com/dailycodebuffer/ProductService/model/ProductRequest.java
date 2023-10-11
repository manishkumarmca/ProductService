package com.dailycodebuffer.ProductService.model;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String price;
    private String quantity;
}
