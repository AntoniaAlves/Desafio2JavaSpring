package com.testejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavaspring.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long> {

}
