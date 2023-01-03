package com.bridgelabz.springjpamappingpractice.repo;

import com.bridgelabz.springjpamappingpractice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
