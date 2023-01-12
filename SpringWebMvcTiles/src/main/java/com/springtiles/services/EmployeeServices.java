package com.springtiles.services;

import java.util.List;

import com.springtiles.model.Employee;

public interface EmployeeServices {

	public void addEmployee(Employee employee);
	public List<Employee> listEmployee();
	public Employee getEmployee(int id);
	public void deleteEmployee(Employee employee);
	
}
