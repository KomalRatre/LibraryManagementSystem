package com.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.BookDao;
import com.spring.rest.entities.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getBooks() {
		return bookDao.findAll();
	}

	@Override
	public Book getBook(Long book_id) {
		Optional<Book> optionalBook = bookDao.findById(book_id);
	    return optionalBook.orElse(null);
	}
	
	@Override
	public Book addBook(Book book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public Book updateBook(Long book_id, Book book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public Book deleteBook(Long book_id) {
		Optional<Book> optionalBook = bookDao.findById(book_id);
	    if (optionalBook.isPresent()) {
	        Book entity = optionalBook.get();
	        bookDao.deleteById(book_id);
	        return entity;
	    }
	    return null;
	}
}
