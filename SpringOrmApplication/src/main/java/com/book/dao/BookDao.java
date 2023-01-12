package com.book.dao;

import java.util.List;

import com.book.model.Book;

public interface BookDao {

	public  void insertBook(Book b);
	public  Book getBookById(int id);
	public  List<Book> getAllBooks();
	public  void updateBookById(Book b);
	public  void deleteBookById(int id);

}
