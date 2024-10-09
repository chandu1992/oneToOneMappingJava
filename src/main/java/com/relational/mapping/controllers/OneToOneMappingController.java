package com.relational.mapping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relational.mapping.oneToOne.entity.Laptop;
import com.relational.mapping.oneToOne.entity.Student;
import com.relational.mapping.serviceImplementations.StudentLaptopServiceImp;

@RestController
public class OneToOneMappingController {

	@Autowired
	StudentLaptopServiceImp stdLpaImp ;
	
	@GetMapping("/saveStdLpt")
	public String saveDataInStudentLaptopUsingOneToOneMappping() {
		
		return stdLpaImp.saveDataToStdLapi();
	}
	
	
}
