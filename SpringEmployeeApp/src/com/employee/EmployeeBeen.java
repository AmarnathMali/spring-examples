package com.employee;

public class EmployeeBeen implements Employee {
	private int eid;
	private String ename;
	private long mobileno;
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public void ShowEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println(eid +" "+ ename+" "+mobileno);
		
	}
	
}
