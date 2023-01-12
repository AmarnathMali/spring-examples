package com.springtiles.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springtiles.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		
	}

	
	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		
		return  (List<Employee>)sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class,id);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(employee);
		
	}

}
