package com.springtiles.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.springtiles.dao.EmployeeDao;
import com.springtiles.model.Employee;

@Service("employeeServices")

public class EmployeeServicesImpl implements EmployeeServices{
	
	@Autowired
	private EmployeeDao employeeDao;
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(employee);
		
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.listEmployee();
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(id);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(employee);
		
	}
	

}
