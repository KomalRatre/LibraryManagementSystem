package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.entities.Borrower;

@Repository
public interface BorrowerDao extends JpaRepository<Borrower, Long>{

}
