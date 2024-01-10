package com.techstore.techstore.controller;

import com.techstore.techstore.model.Product;
import com.techstore.techstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping()
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        try {
            productService.addProduct(product);
            return ResponseEntity.ok("product");
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().body("failed");
        }

    }

    @PutMapping("/update")
    public ResponseEntity<?> updateProduct(Product product) {
        try {
            productService.updateProduct(product);
            return ResponseEntity.ok("update success");
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().body("failed");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delProduct(@PathVariable Long id) {
        try {
            productService.deleteProduct(id);
            return ResponseEntity.ok("del success");
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().body("failed");
        }
    }

}
