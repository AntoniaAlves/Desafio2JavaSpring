package com.testejavaspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testejavaspring.entities.Company;
import com.testejavaspring.repositories.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository repository;

	public List<Company> findAll() {
		return repository.findAll();
	}
	public Company findById(Long id) {
		Optional<Company> obj = repository.findById(id);
		return obj.get();
		
	}
	
}