package com.bridgelabz.springjpamappingpractice.repo;

import com.bridgelabz.springjpamappingpractice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
