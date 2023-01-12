package com.springtiles.dao;

import java.util.List;

import com.springtiles.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee);
	public List<Employee> listEmployee();
	public Employee getEmployee(int id);
	public void deleteEmployee(Employee employee);
	
	
	
}
