package com.employee.bean;



import java.util.List;

import com.employee.model.Employee;
import com.employee.service.Employee1;
import com.employee.service.EmployeeImpl;

public class EmployeeBean implements Employee1 {

	private EmployeeImpl es;

	public void setEs(EmployeeImpl es) {
	this.es = es;
	}

	@Override
	public void insertData(Employee e) {
		// TODO Auto-generated method stub
		es.insertData(e);
		
	}

	@Override
	public List<Employee> getAllUser() {
		// TODO Auto-generated method stub
		List<Employee> list = es.getAllUser();
		return list;
	}

	
}
