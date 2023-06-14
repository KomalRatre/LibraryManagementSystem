package com.spring.rest.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.spring.rest.entities.Book;

public interface BookService {

	List<Book> getBooks();
	
	Book getBook(Long book_id);
	
	Book addBook(Book book);
	
	Book updateBook(Long book_id, Book book);
	
	Book deleteBook(Long book_id);
}
