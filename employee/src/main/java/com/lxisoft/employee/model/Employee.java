package com.lxisoft.employee.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Employee {
	@Generated(value = { "" })
	@Id
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column	
	private String empName;
	
	@Column
	private Date empStartDate;
	
	@Column
	private double empSalary;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getEmpStartDate() {
		return empStartDate;
	}
	public void setEmpStartDate(Date empStartDate) {
		this.empStartDate = empStartDate;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
