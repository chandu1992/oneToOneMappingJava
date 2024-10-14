package com.relational.mapping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relational.mapping.manyTomany.entity.Employee;
import com.relational.mapping.manyTomany.entity.Project;
import com.relational.mapping.serviceImplementations.ManyToManyEmpProject;

@RestController
@RequestMapping("/employee/project")
public class ManyToManyController {

	@Autowired
	ManyToManyEmpProject manyToManyEmpProject;
	
	@PostMapping
	public Employee saveEmployeeWithProject(@RequestBody Employee emp) {
		
		return manyToManyEmpProject.saveEmployeeWithProject(emp);
		
	}
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return manyToManyEmpProject.getAllEmp();
	}
	
	@GetMapping("/{EmpId}")
	public Employee getStudentById(@PathVariable Long EmpId) {
		return manyToManyEmpProject.getEmployeeById(EmpId);
	}
	
	@GetMapping("/find/{empName}")
	public List<Employee> findByContaingEmpName(@PathVariable String empName){
		
		return manyToManyEmpProject.getEmployeesByName(empName);
	}
	
	@GetMapping("/projectList")
	public List<Project> findAllProjects(){
		return manyToManyEmpProject.findAllProjects();
	}
}
