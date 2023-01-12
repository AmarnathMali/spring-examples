package com.employee.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.employee.model.Employee;

public class EmployeeImpl implements Employee1{

	private SessionFactory factory;
	

	//setter injection

	public SessionFactory getFactory() {
	return factory;
	}

	public void setFactory(SessionFactory factory) {
	this.factory = factory;
	}

	@Override
	public void insertData(Employee e) {
		// TODO Auto-generated method stub
		Session ses = factory.openSession();

		Transaction tx = ses.beginTransaction();

		ses.save(e);

		tx.commit();
		
	}

	@Override
	public List<Employee> getAllUser() {
		// TODO Auto-generated method stub
		Session session = getFactory().openSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = criteriaQuery.from(Employee.class);
		
		CriteriaQuery<Employee> criteriaQuery2 = criteriaQuery.select(root);
		Query<Employee> query = session.createQuery(criteriaQuery2);
		List<Employee> employeeList = query.getResultList();
		return employeeList;	
		}



}
