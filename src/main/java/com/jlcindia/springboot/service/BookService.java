package com.jlcindia.springboot.service;

import java.util.List;


import com.jlcindia.springboot.entity.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(Integer bid);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Integer bid);
}
