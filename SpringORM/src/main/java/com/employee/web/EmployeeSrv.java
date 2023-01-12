package com.employee.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.bean.EmployeeBean;
import com.employee.model.Employee;
import com.employee.service.Employee1;
@WebServlet("/")
public class EmployeeSrv extends HttpServlet {
	Employee1 e = null;

	EmployeeBean eb = null;
	public void init()
	{

	ApplicationContext ctx = new ClassPathXmlApplicationContext("employee-cfg.xml");
	e = (Employee1)ctx.getBean("eb");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//General settings
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();

	//reqdata gathing logic
	String name = request.getParameter("ename");
	String salary = request.getParameter("salary");
	String mobilenumber = request.getParameter("mnumber");

	//create entity object
	Employee e1 = new Employee(name,salary,mobilenumber);
	e.insertData(e1);
	
	List<Employee> listUser = eb.getAllUser();
	System.out.println(listUser);
	request.setAttribute("listUser", listUser);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
	dispatcher.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
	}
   
    
}
