package com.lxisoft.employee.service;


import java.util.List;

import org.springframework.data.domain.Pageable;

import com.lxisoft.employee.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee model);

	

	List<Employee> findAll(Pageable pageable);



	void put(Long id, Employee employee);



	void delete(Long id);

	
	
	
	

	

	

}
