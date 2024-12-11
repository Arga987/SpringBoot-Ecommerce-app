package com.nuchange.E_com_proj.service;

import com.nuchange.E_com_proj.model.Product;
import com.nuchange.E_com_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {
        List<Product> products = repo.findAll();
        System.out.println("Products fetched: " + products);
        return products;
    }
}
