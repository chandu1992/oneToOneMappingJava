package com.relational.mapping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relational.mapping.serviceImplementations.OneToManyMappingTesting;

@RestController
public class OneToManyMappingController {

	@Autowired
	OneToManyMappingTesting impOfOneToMany;
	
	@GetMapping("/saveDataToCustAndOrder")
	public String saveDataToCustomerOrder() {
		
		impOfOneToMany.saveDataToCustomerOrder();
		return "data save successfully";
	}
	
	
	@GetMapping("/readDataToCustAndOrder")
	public String readDataToCustomerOrder() {
		
		impOfOneToMany.readDataToCustomerOrder();
		return "data save successfully";
	}
}
