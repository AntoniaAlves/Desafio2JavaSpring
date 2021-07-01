package com.testejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavaspring.entities.Company;

public interface  CompanyRepository extends JpaRepository<Company, Long> {

}
