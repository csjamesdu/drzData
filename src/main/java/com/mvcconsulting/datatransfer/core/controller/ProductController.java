package com.mvcconsulting.datatransfer.core.controller;

import com.google.gson.Gson;
import com.mvcconsulting.datatransfer.core.models.Product;
import com.mvcconsulting.datatransfer.core.services.ProductService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("drzData")
@CrossOrigin(origins = "http://localhost:4200")
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value="/getProducts/{numberOfProduct}", method= RequestMethod.GET)
    public String getProducts(HttpServletRequest request, HttpServletResponse response, @PathVariable String numberOfProduct){

        Integer prodNumber = Integer.valueOf(numberOfProduct);
        List<Product> result = productService.getProduct(prodNumber);

        Gson gson = new Gson();
        String resultStr = gson.toJson(result);

        return resultStr;
    }
}
