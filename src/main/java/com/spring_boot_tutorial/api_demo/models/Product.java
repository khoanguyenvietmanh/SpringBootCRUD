package com.spring_boot_tutorial.api_demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POLO: Plain Object Java Object
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int year;
    private Double price;
    private String url;

    //default constructor
    public Product(String name, int year, Double price, String url) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName=" + name + ", year=" + year + ", price=" + price + ", url=" + url + "}";
    }

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the productName
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the productName to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return Double return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return String return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
