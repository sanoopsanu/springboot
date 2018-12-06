package com.lxisoft.employee.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxisoft.employee.model.Employee;
import com.lxisoft.employee.repo.EmployeeRepo;
import com.lxisoft.employee.service.EmployeeService;



@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public Employee saveEmployee(Employee model) {
		
		return repo.save(model);
	}



	@Override
	public void put(Long id, Employee employee) {
		
		
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}



	@Override
	public List<Employee> findAll(Pageable pageable) {
		
		return repo.findAll();
	}

	




	
}
