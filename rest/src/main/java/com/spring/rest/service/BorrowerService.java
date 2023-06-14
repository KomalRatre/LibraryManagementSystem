package com.spring.rest.service;

import java.util.List;

import com.spring.rest.entities.Borrower;

public interface BorrowerService {
	
	List<Borrower> getBorrowers();
	
	Borrower addBorrower(Borrower borrower);
	
	Borrower getBorrower(Long borrower_id);
	
	Borrower updateBorrower(Long borrower_id, Borrower borrower);
	
	Borrower deleteBorrower(Long borrower_id);
}
