package com.relational.mapping.serviceImplementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relational.mapping.oneToOne.entity.Laptop;
import com.relational.mapping.oneToOne.entity.Student;
import com.relational.mapping.repositories.LaptopRepo;
import com.relational.mapping.repositories.StudentRepo;

@Service
public class StudentLaptopServiceImp {

	@Autowired
	LaptopRepo laptop;
	
	@Autowired
	StudentRepo student;
	
	public String saveDataToStdLapi() {
		
		Student s = new Student();
		s.setStudent_id(152820);
		s.setName("chandra");
		s.setDepartment("Sr.software Engineer");
		
		
		Laptop l = new Laptop();
		l.setLaptopId(102);
		l.setConfiguration("i5");
		l.setModelNo("inspireon 3000");
		l.setStudent(s);
		s.setLaptop(l);
		
		student.save(s);
		
		return "save successfully";
		
	}
	
	// deu to one to one mapping student class we can get laptop object also
	public void getStudnetAndLaptopData() {
		
		Student s = student.findById(152820).get();
		System.out.println(s.getName()+"-"+s.getStudent_id());
		
		System.out.println(s.getLaptop().getConfiguration());
	}
}
