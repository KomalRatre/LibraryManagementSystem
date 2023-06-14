package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entities.Author;
import com.spring.rest.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	//Get Authors
	@GetMapping("/authors")
	public List<Author> getAuthors() {
		return this.authorService.getAuthors();
	}
	
	//Post - Add Author
	@PostMapping("/authors")
	public Author addAuthor(@RequestBody Author author) {
		return this.authorService.addAuthor(author);
	}
	
	//Get Author
	@GetMapping("/authors/{author_id}")
	public Author getAuthor(@PathVariable String author_id) {
		return this.authorService.getAuthor(Long.parseLong(author_id));
	}
	
	//Put - Update Author
	@PutMapping("/authors/{author_id}")
	public Author updateAuthor(@PathVariable String author_id, @RequestBody Author author) {
		return this.authorService.updateAuthor(Long.parseLong(author_id), author);
	}
	
	//Delete - Delete Author
	@DeleteMapping("/authors/{author_id}")
	public Author deleteAuthor(@PathVariable String author_id) {
		return this.authorService.deleteAuthor(Long.parseLong(author_id));
	}
	
}
	

