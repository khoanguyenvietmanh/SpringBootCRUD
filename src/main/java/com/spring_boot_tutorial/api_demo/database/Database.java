package com.spring_boot_tutorial.api_demo.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring_boot_tutorial.api_demo.models.Product;
import com.spring_boot_tutorial.api_demo.repositories.ProductRepository;

@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("MacBook Pro 16", 2020, 2400.0, "");
                Product productB = new Product("Ipad Green Air", 2020, 2400.0, "");
                logger.info("insert data: " + productRepository.save(productA));
                logger.info("insert data: " + productRepository.save(productB));
            }
        };
    }
}
