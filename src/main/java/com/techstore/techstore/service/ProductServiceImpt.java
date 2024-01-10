package com.techstore.techstore.service;

import com.techstore.techstore.model.Product;
import com.techstore.techstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpt implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {

        List<Product> listPD = productRepository.findAll();
        return listPD;

    }

    @Override
    public void addProduct(Product product) {
        try {
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteProduct(Long id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateProduct(Product product) {

        try {
            Optional<Product> curProduct = productRepository.findById(product.getId());

            curProduct.get().setName(product.getName());
            curProduct.get().setPrice(product.getPrice());
            curProduct.get().setStatus(product.isStatus());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
