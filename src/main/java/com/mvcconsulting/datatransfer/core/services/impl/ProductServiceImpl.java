package com.mvcconsulting.datatransfer.core.services.impl;

import com.mvcconsulting.datatransfer.core.models.Product;
import com.mvcconsulting.datatransfer.core.models.ProductWrapper;
import com.mvcconsulting.datatransfer.core.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        resultList.addAll(trialResult.getResult());

//        Integer totalPages = trialResult.getTotalPages();
//        for(Integer t = 2; t< totalPages; t++){
//            counter ++;
//            ProductWrapper subseqWrapper = getProductWithParams(t);
//            resultList.addAll(subseqWrapper.getResult());
//            resultMap.put(t, subseqWrapper.getResult());
//        }

        return resultList;
    }

    public ProductWrapper getTrialProduct(Integer prodNumber){
        URI url = URI.create(BASE_URL + "/products?page_no=1&limit="+prodNumber);
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
