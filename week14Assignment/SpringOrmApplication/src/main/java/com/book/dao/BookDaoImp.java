package com.book.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.book.model.Book;

public class BookDaoImp implements BookDao{

	private SessionFactory factory;

	
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void insertBook(Book b) {
		
		Session session = getFactory().openSession();
		session.beginTransaction();
		session.save(b);
		session.getTransaction().commit();
		
	}

	@Override
	public Book getBookById(int id) {
		Session session = getFactory().openSession();
		Book b = session.get(Book.class, id);
		return b;	
		
	}

	@Override
	public List<Book> getAllBooks() {
		Session session = getFactory().openSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
		Root<Book> root = criteriaQuery.from(Book.class);
		
		CriteriaQuery<Book> criteriaQuery2 = criteriaQuery.select(root);
		Query<Book> query = session.createQuery(criteriaQuery2);
		List<Book> bookList = query.getResultList();
		return bookList;	
	}

	@Override
	public void updateBookById(Book b) {
		Session session = getFactory().openSession();
		session.beginTransaction();
		session.update(b);
		session.getTransaction().commit();
		
		
	}

	@Override
	public void deleteBookById(int id) {
		Session session = getFactory().openSession();
		Book b = session.get(Book.class, id);
		session.beginTransaction();
		session.delete(b);
		session.getTransaction().commit();

		
	}
	
}
