package com.testejavaspring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testejavaspring.entities.Company;
import com.testejavaspring.services.CompanyService;


@RestController
@RequestMapping(value = "/companies")
public class CompanyResource {

	@Autowired 
	private CompanyService service;
	
	@GetMapping
	public ResponseEntity<List<Company>> findAll() {
		List<Company> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Company> findById(@PathVariable Long id) {
		Company obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}