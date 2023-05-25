package com.techstore.techstore.controller;

import com.techstore.techstore.model.Product;
import com.techstore.techstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping()
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

}
