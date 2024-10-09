package com.relational.mapping.oneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="tbl_laptop")
public class Laptop {

	@Id
	private long laptopId;
	private String modelNo;
	private String configuration;
	
	@OneToOne  //create one column in tbl_laptop name is student_id
	@JoinColumn(name = "student_id")
	private Student student;

	public Laptop() {
		super();
	}

	public Laptop(long laptopId, String modelNo, String configuration, Student student) {
		super();
		this.laptopId = laptopId;
		this.modelNo = modelNo;
		this.configuration = configuration;
		this.student = student;
	}

	public long getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(long laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", modelNo=" + modelNo + ", configuration=" + configuration
				+ ", student=" + student + "]";
	}
	
	
}
