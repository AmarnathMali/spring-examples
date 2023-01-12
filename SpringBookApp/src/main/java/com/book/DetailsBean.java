package com.book;

public class DetailsBean {

	private String bookDesc;

	public DetailsBean(String bookDesc) {
		super();
		this.bookDesc = bookDesc;
	}

	@Override
	public String toString() {
		return bookDesc;
	} 
	
	
}
