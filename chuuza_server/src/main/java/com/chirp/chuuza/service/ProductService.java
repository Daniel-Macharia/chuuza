package com.chirp.chuuza.service;

import com.chirp.chuuza.model.Product;
import com.chirp.chuuza.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product)
    {
        productRepository.save(product);
    }
}
