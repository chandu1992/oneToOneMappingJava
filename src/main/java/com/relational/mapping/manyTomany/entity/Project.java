package com.relational.mapping.manyTomany.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_project")
public class Project {

	@Id
	@GeneratedValue
	private long projectId;
	private String projectname;
	private String expiryDate;

	@ManyToMany(mappedBy = "projectList", cascade = CascadeType.ALL)
//	@JsonBackReference
	private List<Employee> employeeList;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(long projectId, String projectname, String expiryDate, List<Employee> employeeList) {
		super();
		this.projectId = projectId;
		this.projectname = projectname;
		this.expiryDate = expiryDate;
		this.employeeList = employeeList;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectname=" + projectname + ", expiryDate=" + expiryDate
				+ ", employeeList=" + employeeList + "]";
	}

}
