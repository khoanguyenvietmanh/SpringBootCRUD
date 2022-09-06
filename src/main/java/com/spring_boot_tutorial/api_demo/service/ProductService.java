package com.spring_boot_tutorial.api_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_tutorial.api_demo.models.Product;
import com.spring_boot_tutorial.api_demo.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Product has been deleted !!!";
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setUrl(product.getUrl());
        existingProduct.setYear(product.getYear());

        return productRepository.save(existingProduct);
    }
}
