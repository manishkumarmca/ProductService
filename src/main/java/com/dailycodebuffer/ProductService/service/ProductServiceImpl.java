package com.dailycodebuffer.ProductService.service;

import com.dailycodebuffer.ProductService.entity.Product;
import com.dailycodebuffer.ProductService.model.ProductRequest;
import com.dailycodebuffer.ProductService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest) {
        log.info("Added Product....");

        Product product
                =Product.builder()
                .productName(productRequest.getName())
                .quantity(Long.parseLong(productRequest.getQuantity()))
                .price(Long.parseLong(productRequest.getPrice()))
                .build();

        productRepository.save(product);
        log.info("Product created");
        return product.getProductId();
    }
}
