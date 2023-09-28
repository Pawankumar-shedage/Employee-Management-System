package com.Day2.services;

import java.util.List;



import com.Day2.entity.Employee;


public interface employeeService {

	public void addEmployee(Employee emp);
	
	public Employee updateEmployee(int emp_id);
	
	public void deleteEmployee(int emp_id);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(int emp_id);

	
	
}
