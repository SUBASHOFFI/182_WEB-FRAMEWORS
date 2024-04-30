// ProductService.java
package com.example.bankingapp15cw3.service;

import com.example.bankingapp15cw3.model.Product;
import com.example.bankingapp15cw3.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id);
    }

    public Product updateProduct(int id, Product updatedProduct) {
        Product existingProduct = getProductById(id);
        if (existingProduct != null) {
            updatedProduct.setId(id);
            return productRepo.save(updatedProduct);
        }
        return null;
    }

    public void deleteProductById(int id) {
        productRepo.deleteById(id);
    }
}
