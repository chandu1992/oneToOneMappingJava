package com.relational.mapping.oneToOne.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_studnet")
public class Student {

	@Id
	private long student_id;
	private String name;
	private String department;
	
	@OneToOne(mappedBy ="student", cascade = CascadeType.ALL)
	private Laptop laptop;

	public Student(long student_id, String name, String department, Laptop laptop) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.department = department;
		this.laptop = laptop;
	}

	public Student() {
		super();
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", department=" + department + ", laptop="
				+ laptop + "]";
	}
	
	
}
