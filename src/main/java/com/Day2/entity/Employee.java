package com.Day2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// JPA java Persistence API; (Auto query maker)

@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;

	
	private String emp_name;
	
	
	private String dept_name;
	
	

	public Employee(int emp_id, String emp_name, String dept_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
	}


	public Employee() {
		super();
		
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



}
