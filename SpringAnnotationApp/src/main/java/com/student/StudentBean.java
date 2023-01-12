package com.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("s")
public class StudentBean implements Student{
	
	private int studentid;
	private String studentname;
	/*@Value("1001")
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	@Value("Rahul")
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}*/
	
	
	public void studentInfo() {


		System.out.println(studentid+" "+studentname);
		
	}
	public StudentBean(@Value("1001")int studentid, @Value("Rahul")String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}

}
