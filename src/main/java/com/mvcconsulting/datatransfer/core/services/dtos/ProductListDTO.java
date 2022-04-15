package com.mvcconsulting.datatransfer.core.services.dtos;

import com.mvcconsulting.datatransfer.core.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListDTO {
    private List<Product> productList;

    public ProductListDTO(){
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
