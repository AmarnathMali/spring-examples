package com.mail.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("/mail-cfg.xml");
		SendMail sm = (SendMail)ctx.getBean("ms");
		sm.sendMail("123maliamar@gmail.com", "amarnath.mali2000@gmail.com", "wish msg", "happy aug15th");
		System.out.println("mail devliverd succssfully!!!");
		
	}

}
