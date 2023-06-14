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

import com.spring.rest.entities.Borrower;
import com.spring.rest.service.BorrowerService;

@RestController
public class BorrowerController {
	
	@Autowired
	private BorrowerService borrowerService;
	
	//Get Borrowers
	@GetMapping("/borrowers")
	public List<Borrower> getBorrowers(){
		return this.borrowerService.getBorrowers();
	}
	
	//Post Borrowers
	@PostMapping("/borrowers")
	public Borrower addBorrower(@RequestBody Borrower borrower) {
		return this.borrowerService.addBorrower(borrower);
	}
	
	//Get Particular Borrower
	@GetMapping("/borrowers/{borrower_id}")
	public Borrower getBorrower(@PathVariable String borrower_id) {
		return this.borrowerService.getBorrower(Long.parseLong(borrower_id));
	}
	
	//Put - update borrower
	@PutMapping("/borrowers/{borrower_id}")
	public Borrower updateBorrower(@PathVariable String borrower_id, @RequestBody Borrower borrower) {
		return this.borrowerService.updateBorrower(Long.parseLong(borrower_id), borrower);
	}
	
	//Delete - delete borrower
	@DeleteMapping("/borrowers/{borrower_id}")
	public Borrower deleteBorrower(@PathVariable String borrower_id) {
		return this.borrowerService.deleteBorrower(Long.parseLong(borrower_id));
	}
}
