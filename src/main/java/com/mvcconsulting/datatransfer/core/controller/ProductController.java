package com.mvcconsulting.datatransfer.core.controller;

import com.google.gson.Gson;
import com.mvcconsulting.datatransfer.core.models.Product;
import com.mvcconsulting.datatransfer.core.services.ProductService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value="/getProducts", method= RequestMethod.GET)
    public String getProducts(HttpServletRequest request, HttpServletResponse response){

        List<Product> result = productService.getProduct();

        Gson gson = new Gson();

        String resultStr = gson.toJson(result);

        return resultStr;
    }
}