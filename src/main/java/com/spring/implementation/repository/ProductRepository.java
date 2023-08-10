package com.spring.implementation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.implementation.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{

}
