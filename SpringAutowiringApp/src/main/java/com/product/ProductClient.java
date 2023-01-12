package com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ApplicationContext ctx = new ClassPathXmlApplicationContext("product.cfg.xml");
		Product p = (Product) ctx.getBean("pp");
		p.productDetails();
	}

}
