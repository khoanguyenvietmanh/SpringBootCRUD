package com.spring_boot_tutorial.api_demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_tutorial.api_demo.models.Product;
import com.spring_boot_tutorial.api_demo.service.ProductService;


@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //DI = Dependency Injection
    
    @Autowired
    private ProductService service;
    
    @PostMapping(path = "/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping(path = "/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping(path = "/getProducts")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping(path = "/getProductById/{id}")
    public Product getProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @GetMapping(path = "/getProductByName/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PostMapping(path = "/updateProduct") 
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping(path = "/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return service.deleteProduct(id);
    }
}
