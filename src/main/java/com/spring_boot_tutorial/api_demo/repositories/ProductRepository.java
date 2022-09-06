package com.spring_boot_tutorial.api_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_tutorial.api_demo.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    Product findByName(String name);
}
