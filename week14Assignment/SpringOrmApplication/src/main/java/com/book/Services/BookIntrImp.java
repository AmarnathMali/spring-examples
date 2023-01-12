package com.book.Services;

import java.util.List;

import com.book.dao.BookDao;
import com.book.model.Book;

public class BookIntrImp implements BookIntr{

	private BookDao bookDao;
	

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void insertBook(Book b) {
		// TODO Auto-generated method stub
		bookDao.insertBook(b);
		
	}

	@Override
	public Book getBookById(int id) {
		
		return bookDao.getBookById(id);
	}
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.getAllBooks();
	}

	@Override
	public void updateBookById(Book b) {
		// TODO Auto-generated method stub
		bookDao.updateBookById(b);
		
	}

	@Override
	public void deleteBookById(int id) {
		// TODO Auto-generated method stub
		bookDao.deleteBookById(id);
	}
	
	
}
