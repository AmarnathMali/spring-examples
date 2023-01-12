package com.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.Services.BookIntr;
import com.book.Services.BookIntrImp;
import com.book.model.Book;



@WebServlet("/")
public class BookServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	BookIntr b=null;
	
	
	public void init() {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("book-cfg.xml");
		b = (BookIntr) ctx.getBean("ldao",BookIntr.class);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();

		switch (action) {
		case "/new":
			showNewForm(request, response);
			break;
		case "/insert":
			insertUser(request, response);
			break;
		case "/delete":
			deleteUser(request, response);
			break;
		case "/edit":
			showEditForm(request, response);
			break;
		case "/update":
			updateUser(request, response);
			break;
		default:
			listUser(request, response);
			break;
		}
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-from.jsp");
		dispatcher.forward(request, response);
		
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String bname = request.getParameter("bname");
		String aname = request.getParameter("aname");
		String price = request.getParameter("price");
		Book newBook = new Book(bname, aname, price);
		b.insertBook(newBook);
		response.sendRedirect("list");
		
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		b.deleteBookById(id);
		response.sendRedirect("list");
	
		
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Book bookUser = b.getBookById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-from.jsp");
		request.setAttribute("book", bookUser);
		dispatcher.forward(request, response);

		
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String bname = request.getParameter("bname");
		String aname = request.getParameter("aname");
		String price = request.getParameter("price");

		Book user = new Book(id, bname, aname, price);
		b.updateBookById(user);
		response.sendRedirect("list");

		
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Book> listUser = b.getAllBooks();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);

		
	}

	
	
	
	}

	


