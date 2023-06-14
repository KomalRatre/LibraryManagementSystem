package com.spring.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entities.Book;
import com.spring.rest.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//Get Books
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.bookService.getBooks();
	}
	
	//Get Particular Book
	@GetMapping("/books/{book_id}")
	public Book getBook(@PathVariable String book_id) {
		return this.bookService.getBook(Long.parseLong(book_id));
	}
	
	//Post - add new book
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	//Put - update book
	@PutMapping("/books/{book_id}")
	public Book updateBook(@PathVariable String book_id,@RequestBody Book book) {
		return this.bookService.updateBook(Long.parseLong(book_id), book);
	}
	
	@DeleteMapping("/books/{book_id}")
	public Book deleteBook(@PathVariable String book_id) {
		return this.bookService.deleteBook(Long.parseLong(book_id));
	}
}
