package com.mvcconsulting.datatransfer.core.services;

import com.mvcconsulting.datatransfer.core.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProduct(Integer prodNumber);

    Product getProductBySku(String sku);
}
