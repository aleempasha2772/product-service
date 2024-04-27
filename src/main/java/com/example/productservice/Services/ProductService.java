package com.example.productservice.Services;

import com.example.productservice.Entity.Product;
import com.example.productservice.Model.ProductRequest;
import com.example.productservice.Model.ProductResponse;

import java.util.List;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    List<Product> getAllProducts();
}
