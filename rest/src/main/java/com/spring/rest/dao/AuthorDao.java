package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.entities.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Long>{

}
