package com.bridgelabz.springjpamappingpractice.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_product")
public class Product {
    @Id
    private String pId;
    private String productName;
    @ManyToMany(mappedBy = "products")
    private List<Category> categories = new ArrayList<>();

    public Product() {
    }

    public Product(String pId, String productName) {
        this.pId = pId;
        this.productName = productName;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
