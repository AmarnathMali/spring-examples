package com.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class BookClient {


	public static void main(String[] args) {
		
		ApplicationContext ctx  = new FileSystemXmlApplicationContext("./src/main/java/book.cfg.xml");
		Book b = (Book) ctx.getBean("b");
		b.showBookDetails();

	}

}
