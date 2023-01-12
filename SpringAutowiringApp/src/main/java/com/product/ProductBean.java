package com.product;

public class ProductBean implements Product{

	private int pid;
	private String pname;
	private double price;
	private ExtraBean eb;

	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setEb(ExtraBean eb) {
		this.eb = eb;
	}

	public void productDetails() {

		System.out.println(pid + " " + pname + " " + price + " " + eb);

	}
}
