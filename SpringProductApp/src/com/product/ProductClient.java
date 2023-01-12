package com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new FileSystemXmlApplicationContext("./src/product.cfg.xml");
		Product p = (Product) factory.getBean("p");
		p.ShowProductDetails();

	}

}
