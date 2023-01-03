package com.bridgelabz.springjpamappingpractice;

import com.bridgelabz.springjpamappingpractice.entities.*;
import com.bridgelabz.springjpamappingpractice.repo.CategoryRepo;
import com.bridgelabz.springjpamappingpractice.repo.ProductRepo;
import com.bridgelabz.springjpamappingpractice.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class SpringJpaMappingPracticeApplication implements CommandLineRunner {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductRepo productRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaMappingPracticeApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        // ONE TO ONE
//        Student student = new Student();
//        student.setStudentName("Farhan");
//        student.setAbout("I am Software Engineer");
//        student.setStudentId(2);
//
//        Laptop laptop = new Laptop();
//        laptop.setModelNumber("D54645");
//        laptop.setBrand("Apple");
//        laptop.setLaptopId(163);
//
//        laptop.setStudent(student);
//        student.setLaptop(laptop);
//
//
//        Student save = studentRepo.save(student);
//
//        log.info("saved student :{}", save.getStudentName());

        //ONE TO MANY
//        Student student = new Student();
//        student.setStudentName("Rahul");
//        student.setAbout("I am Engineer");
//        student.setStudentId(1);
//
//        Address a1 = new Address();
//        a1.setAddressId(123);
//        a1.setStreet("22/30");
//        a1.setCity("DEL");
//        a1.setCountry("INDIA");
//        a1.setStudent(student);
//
//        Address a2 = new Address();
//        a2.setAddressId(124);
//        a2.setStreet("11/30");
//        a2.setCity("MAHR");
//        a2.setCountry("INDIA");
//        a2.setStudent(student);
//
//        List<Address> addressList = new ArrayList<>();
//        addressList.add(a1);
//        addressList.add(a2);
//
//        student.setAddressList(addressList);
//
//        Student save = studentRepo.save(student);
//        log.info("Student Created : With Address");

        //      MANY TO MANY

        Product p1 = new Product();
        p1.setpId("pid1");
        p1.setProductName("Iphone 14 max pro");

        Product p2 = new Product();
        p2.setpId("pid2");
        p2.setProductName("Samsung s22 Ultra");

        Product p3 = new Product();
        p3.setpId("pid3");
        p3.setProductName("OnePlus TV24254");

        Category c1 = new Category();
        c1.setcId("cid1");
        c1.setTitle("Electronics");

        Category c2 = new Category();
        c2.setcId("cid2");
        c2.setTitle("Mobile Phones");

        List<Product> category1Product = c1.getProducts();
        category1Product.add(p1);
        category1Product.add(p2);
        category1Product.add(p3);

        List<Product> category2Product = c2.getProducts();
        category2Product.add(p1);
        category2Product.add(p2);

        categoryRepo.save(c1);
        categoryRepo.save(c2);
    }
}
