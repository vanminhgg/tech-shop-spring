package com.techstore.techstore.service;

import com.techstore.techstore.model.Product;
import com.techstore.techstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpt implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {

        List<Product> listPD = productRepository.findAll();
        return listPD;

    }
}
