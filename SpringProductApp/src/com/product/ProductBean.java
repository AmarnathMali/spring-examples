package com.product;

public class ProductBean implements Product{
	private int pid;
	private String pname;
	private double price;
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public void ShowProductDetails() {
		// TODO Auto-generated method stub
		System.out.println(pid+" "+" "+pname+" "+price);
	}
	
}
