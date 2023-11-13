package com.jlcindia.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlcindia.springboot.dao.BookDAO;
import com.jlcindia.springboot.entity.Book;

@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> getAllBooks() {
		System.out.println("-----BookServiceImpl--getAllBooks()---------");
    	return bookDAO.findAll();
	}

	@Override
	public Book getBookById(Integer bid) {
		System.out.println("-----BookServiceImpl--getBookById()---------");
			return bookDAO.findById(bid).get();
	}

	@Override
	public void addBook(Book book) {
		System.out.println("-----BookServiceImpl--addBook()---------");
		bookDAO.save(book);
	}

	@Override
	public void updateBook(Book book) {
		System.out.println("-----BookServiceImpl--updateBook()---------");
		bookDAO.saveAndFlush(book);
	}

	@Override
	public void deleteBook(Integer bid) {
		System.out.println("-----BookServiceImpl--deleteBook()---------");
		bookDAO.deleteById(bid);
	}

}
