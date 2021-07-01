package com.testejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavaspring.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {

}
