package com.relational.mapping.serviceImplementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relational.mapping.manyTomany.entity.Employee;
import com.relational.mapping.manyTomany.entity.Project;
import com.relational.mapping.repositories.EmployeeRepo;
import com.relational.mapping.repositories.ProjectRepo;

@Service
public class ManyToManyEmpProject {

	@Autowired
	private EmployeeRepo emprepo;

	@Autowired
	private ProjectRepo prjRepo;

	public Employee saveEmployeeWithProject(Employee emp) {
		// TODO Auto-generated method stub
		
		return emprepo.save(emp);

	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return emprepo.findById(id).orElse(null);
	}

	public List<Employee> getEmployeesByName(String empName) {
		// TODO Auto-generated method stub
		return emprepo.findByEmpNameContaining(empName);
	}

	public List<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return prjRepo.findAll();
	}


}
