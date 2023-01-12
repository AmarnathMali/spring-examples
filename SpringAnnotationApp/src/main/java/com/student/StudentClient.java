package com.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StudentBean.class);
		Student s = (Student)ctx.getBean("s");
		s.studentInfo();


	}

}
