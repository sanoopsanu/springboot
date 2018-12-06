package com.lxisoft.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.employee.model.Employee;
import com.lxisoft.employee.service.EmployeeService;





@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/employeeSave")
	@ResponseBody
	public Employee save(@RequestBody Employee employee) {
		
		service.saveEmployee(employee);
		return employee;
	}
	

	@PutMapping("/employeeUpdate")
	@ResponseBody
	  public void updateEmployee(@RequestBody Employee employee) {
	        Employee emp =service.saveEmployee(employee);
	      
	    }
	@DeleteMapping("/employeeDelete/{id}")
	@ResponseBody
	  public void deleteEmployee(@PathVariable Long id) {
	        service.delete(id);
	      
	        
	        
	        
	    }
	@GetMapping("/employeeGetAllDetails")
	@ResponseBody
	 public List<Employee> getAllEmployee() {
		List<Employee> model=service.findAll(null);
		return  model;
		 
	}
	  
}
