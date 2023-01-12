package com.person;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonBean implements Person{
	private int pid;
	private String pname;
	private String address;
	private String[] favcolors;
	private List favsubjects;
	private Set phonenumbers;
	private Map technologies;
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFavcolors(String[] favcolors) {
		this.favcolors = favcolors;
	}
	public void setFavsubjects(List favsubjects) {
		this.favsubjects = favsubjects;
	}
	public void setPhonenumbers(Set phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	public void setTechnologies(Map technologies) {
		this.technologies = technologies;
	}
	public void showPersonInfo() {
		System.out.println(pid+" "+pname+" "+address+" "+favcolors[0]+" "+favcolors[1]+" "+favsubjects+" "+phonenumbers+" "+technologies);
				
	}
	

}
