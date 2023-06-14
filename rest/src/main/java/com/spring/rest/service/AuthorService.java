package com.spring.rest.service;

import java.util.List;

import com.spring.rest.entities.Author;

public interface AuthorService {

	List<Author> getAuthors();
	
	Author addAuthor(Author author);
	
	Author getAuthor(Long author_id);
	
	Author updateAuthor(Long author_id, Author author);
	
	Author deleteAuthor(Long author_id);
}
