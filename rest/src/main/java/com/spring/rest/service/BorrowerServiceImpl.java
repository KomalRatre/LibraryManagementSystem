package com.spring.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.BorrowerDao;
import com.spring.rest.entities.Borrower;

@Service
public class BorrowerServiceImpl implements BorrowerService {
	
	@Autowired
	private BorrowerDao borrowerDao;

	@Override
	public List<Borrower> getBorrowers() {
		return borrowerDao.findAll();
	}

	@Override
	public Borrower addBorrower(Borrower borrower) {
		borrowerDao.save(borrower);
		return borrower;
	}

	@Override
	public Borrower getBorrower(Long borrower_id) {
		Optional<Borrower> optionalBorrower = borrowerDao.findById(borrower_id);
	    return optionalBorrower.orElse(null);
	}

	@Override
	public Borrower updateBorrower(Long borrower_id, Borrower borrower) {
		borrowerDao.save(borrower);
		return borrower;
	}

	@Override
	public Borrower deleteBorrower(Long borrower_id) {
		Optional<Borrower> optionalBorrower = borrowerDao.findById(borrower_id);
	    if (optionalBorrower.isPresent()) {
	        Borrower entity = optionalBorrower.get();
	        borrowerDao.deleteById(borrower_id);
	        return entity;
	    }
	    return null;
	}
	
	

}
