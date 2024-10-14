package com.relational.mapping.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relational.mapping.manyTomany.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	List<Employee> findByEmpNameContaining(String name);
}
