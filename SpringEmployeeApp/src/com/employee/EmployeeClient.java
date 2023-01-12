package com.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileSystemResource res = new FileSystemResource("./src/Employee.cfg.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
		ApplicationContext factory = new FileSystemXmlApplicationContext("./src/employee.cfg.xml");
		Employee e = (Employee) factory.getBean("e");
		e.ShowEmployeeDetails();
		}

		


	}

