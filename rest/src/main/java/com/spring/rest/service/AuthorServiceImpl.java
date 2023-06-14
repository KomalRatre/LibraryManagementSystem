package com.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.AuthorDao;
import com.spring.rest.entities.Author;


@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorDao authorDao;

	@Override
	public List<Author> getAuthors() {
		return authorDao.findAll();
	}

	@Override
	public Author addAuthor(Author author) {
		authorDao.save(author);
		return author;
	}

	@Override
	public Author getAuthor(Long author_id) {
		Optional<Author> optionalAuthor = authorDao.findById(author_id);
	    return optionalAuthor.orElse(null);
	}

	@Override
	public Author updateAuthor(Long author_id, Author author) {
		authorDao.save(author);
		return author;
	}

	@Override
	public Author deleteAuthor(Long author_id) {
		Optional<Author> optionalAuthor = authorDao.findById(author_id);
	    if (optionalAuthor.isPresent()) {
	        Author entity = optionalAuthor.get();
	        authorDao.deleteById(author_id);
	        return entity;
	    }
	    return null;
	}
}
