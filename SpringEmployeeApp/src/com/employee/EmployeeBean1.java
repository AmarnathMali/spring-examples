package com.employee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EmployeeBean1 implements Employee,BeanNameAware, BeanFactoryAware,ApplicationContextAware{
	
	private int eid;
	private String ename;
	private long mobileno;
	private BeanFactory factory;
	private String bname;
	private ApplicationContext ctx;
	
	public EmployeeBean1(int eid, String ename, long mobileno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mobileno = mobileno;
	}
	
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("beanfactory");
		this.factory=factory;
		
	}
	@Override
	public void setBeanName(String bname) {
		// TODO Auto-generated method stub
		System.out.println("bean name");
		this.bname=bname;
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("application context");
		this.ctx =ctx;
		
	}
	@Override
	public void ShowEmployeeDetails() {
	    System.out.println("current bname is:"+bname);
	    System.out.println("factory name: "+ factory);
	    System.out.println("application context: "+ctx);
		System.out.println(eid+" "+ename+" "+mobileno);
	}
	
}
