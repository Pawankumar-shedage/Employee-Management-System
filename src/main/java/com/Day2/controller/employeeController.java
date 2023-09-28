package com.Day2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Day2.entity.Employee;

import com.Day2.services.employeeService;


@Controller
public class employeeController {
	
	@Autowired
	private employeeService empService;
	
	
	public  employeeService getEmpService() {
		return empService;
	}

	public void setEmpService(employeeService empService) {
		this.empService = empService;
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/home")
	public ModelAndView getAllEmployee(){
		List<Employee> employees= empService.getAllEmployee();
		
		return new ModelAndView("home","emp",employees);

	}
	
	//ADD Employee
	@GetMapping("/home/addEmployeeDetails")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("adddd", new Employee());
        return "add";
    }
	
	@PostMapping("/save")
	public String  addEmployee( @ModelAttribute Employee emp)
	{
		empService.addEmployee(emp);
		return "redirect:/home";
	}
	
	
	//Update Edit
	@GetMapping("/home/edit/{emp_id}")
	public String updateEmployee( @PathVariable("emp_id") int emp_id, Model model)
	{
		Employee emp = empService.getEmployeeById(emp_id);
		model.addAttribute("emp",emp);
		return "edit";
	}
	
	//get mapping  delete
	
	//DELETE
	@RequestMapping("/home/{emp_id}")
	public String deleteEmployee(@PathVariable("emp_id") int emp_id)
	{
		empService.deleteEmployee(emp_id);
		return "redirect:/home";
	}
	
	@GetMapping("/employee/{emp_id}")
	public  Employee getEmployee(int emp_id)
	{
		return empService.getEmployeeById(emp_id);
	}
	
	
	
}
