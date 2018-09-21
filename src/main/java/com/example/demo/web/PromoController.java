package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.AccountService;
import com.example.demo.business.Sender;
import com.example.demo.db.AccountRepository;
import com.example.demo.domain.Account;

@RestController
@RequestMapping("/api")
public class PromoController {

	// Autowired
    private AccountRepository repository;
	
    /*
	public void setAccountRepository(AccountRepository repository) {
		this.repository = repository;
	}
	*/

	public PromoController(AccountRepository repository) {
		this.repository = repository;
	}
	
	@Autowired
	private AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping("/accounts")
	public Iterable<Account> getAccounts() {
		//return accountService.getAccounts();
		
		Iterable<Account> accounts = repository.findAll();
		
		System.out.println("--- : sending AMQP message");	
		try {
			Sender.send();
		} catch(Exception e) {
			System.err.println("*** :" + e);
		}

		return accounts;		
	}
	
	
}
