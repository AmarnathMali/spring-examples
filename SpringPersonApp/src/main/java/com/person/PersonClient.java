package com.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonClient {

	public static void main(String[] args) {
		

		ApplicationContext ctx = new ClassPathXmlApplicationContext("person-cfg.xml");
		Person p = (Person)ctx.getBean("p");
		p.showPersonInfo();
		

	}

}
