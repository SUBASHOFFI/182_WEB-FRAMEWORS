// ProductRepo.java
package com.example.bankingapp15cw3.repository;

import com.example.bankingapp15cw3.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepo {

    // Simulated in-memory database
    private final Map<Integer, Product> products = new HashMap<>();
    private int idCounter = 1;

    public Product save(Product product) {
        if (product.getId() == 0) {
            product.setId(idCounter++);
        }
        products.put(product.getId(), product);
        return product;
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public Product findById(int id) {
        return products.get(id);
    }

    public void deleteById(int id) {
        products.remove(id);
    }
}
