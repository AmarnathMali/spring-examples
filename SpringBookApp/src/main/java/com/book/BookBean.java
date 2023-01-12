package com.book;

public class BookBean implements Book {

	private int bid;
	private String bname;
	private String aname;
	private DetailsBean db;
	 
	
	
	public BookBean(int bid, String bname, String aname, DetailsBean db) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
		this.db = db;
	}



	public void showBookDetails() {
		// TODO Auto-generated method stub
		System.out.println(bid+" "+ bname+" "+aname +" "+db);
		
	}
	
}
