package com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBoperationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("dboperation-cfg.xml");
		DBoperation db = (DBoperation)ctx.getBean("dob");
		
		
		//int result = db.insertInfo(2003,"sharan","kol");
		//int result = db.updateDetails(2001,"robertmarg","usa");
		//int result = db.deleteDetails(2002);
		//System.out.println(db.getDetails());
		System.out.println(db.getEmpDetails(2005));
		//pSystem.out.println(result+" deleted");
      

	}

}
