package com.techstore.techstore.service;

import com.techstore.techstore.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAllProduct();

    public void addProduct(Product product);

    public void deleteProduct(Long id);

    public void updateProduct(Product product);

}
