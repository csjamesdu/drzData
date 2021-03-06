package com.mvcconsulting.datatransfer.core;

import com.mvcconsulting.datatransfer.core.services.MonoRestService;
import com.mvcconsulting.datatransfer.core.services.ProductService;
import com.mvcconsulting.datatransfer.core.services.TemplateAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {

    @Autowired
    private MonoRestService monoRestService;

    @Autowired
    private TemplateAuthService templateRestService;

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        productService.getProduct();
    }
}
