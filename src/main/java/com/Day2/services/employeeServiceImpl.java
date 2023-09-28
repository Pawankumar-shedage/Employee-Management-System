package com.Day2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day2.entity.Employee;
import com.Day2.repository.EmployeeRepository;

@Service
public class employeeServiceImpl implements employeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
		
	}

	
	public Employee updateEmployee( int emp_id) {
		return employeeRepository.findById(emp_id).get();	
	}

	
	public void deleteEmployee(int emp_id) {
		employeeRepository.deleteById(emp_id);
		
	}

	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	
	public Employee getEmployeeById(int emp_id) {
		
		return employeeRepository.findById(emp_id).get();
	}

	

}
