package com.bridgelabz.springjpamappingpractice.repo;

import com.bridgelabz.springjpamappingpractice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {
}
