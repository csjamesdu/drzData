package com.mvcconsulting.datatransfer.core.services.impl;

import com.mvcconsulting.datatransfer.core.models.Product;
import com.mvcconsulting.datatransfer.core.models.ProductWrapper;
import com.mvcconsulting.datatransfer.core.services.ProductService;
import com.mvcconsulting.datatransfer.core.services.dtos.ProductListDTO;
import com.mvcconsulting.datatransfer.core.services.dtos.SkusQryParamDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

@Service
public class ProductServiceImpl implements ProductService {

    private final RestTemplate restTemplate;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    private static final String BASE_URL = "https://api.dropshipzone.com.au";

    @Autowired
    public ProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getProduct(Integer prodNumber){

        List<Product> resultList = new ArrayList<>();
        Map<Integer, List<Product>> resultMap = new HashMap<>();
        Integer counter = 0;

        ProductWrapper trialResult = getTrialProduct(prodNumber);
        List<Product> products = trialResult.getResult().stream().distinct().collect(Collectors.toList());

        resultList.addAll(products);

//        Integer totalPages = trialResult.getTotalPages();
//        for(Integer t = 2; t< totalPages; t++){
//            counter ++;
//            ProductWrapper subseqWrapper = getProductWithParams(t);
//            resultList.addAll(subseqWrapper.getResult());
//            resultMap.put(t, subseqWrapper.getResult());
//        }

        return resultList;
    }

    @Override
    public Product getProductBySku(String sku) {

        List<Product> productList = getProductListBySku(sku);
        return productList.get(0);
    }

    private List<Product> getProductListBySku(String sku){
        URI url = URI.create(BASE_URL + "/getProductBySkus");
        SkusQryParamDTO paramDTO = new SkusQryParamDTO(sku);
        ResponseEntity<Product[]> response = restTemplate.postForEntity(url, paramDTO, Product[].class);
        Product[] productsArray = response.getBody();
        return Arrays.stream(productsArray).collect(Collectors.toList());
    }

    public ProductWrapper getTrialProduct(Integer prodNumber){
        URI url = URI.create(BASE_URL + "/products?page_no=2&limit="+prodNumber);
        ProductWrapper wrapper = restTemplate.getForObject(url, ProductWrapper.class);
        return wrapper;
    }

    public ProductWrapper getProductWithParams(Integer pageNumber){
        URI url = URI.create(BASE_URL + "/products" + "?page_no=" + pageNumber + "&limit=160");
        ProductWrapper wrapper = restTemplate.getForObject(url, ProductWrapper.class);
        LOGGER.info(url.toString());
        return wrapper;
    }
}
