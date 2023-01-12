package com.book.Services;

import java.util.List;

import com.book.model.Book;

public interface BookIntr {

	public void insertBook(Book b);

	public Book getBookById(int id);

	public List<Book> getAllBooks();

	public void updateBookById(Book b);

	public void deleteBookById(int id);

}
