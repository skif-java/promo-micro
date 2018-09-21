package com.example.demo.business;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.PromoMicroConfigTest;
import com.example.demo.domain.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {PromoMicroConfigTest.class})
public class AccountServiceImplTest {

	@Autowired
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@Test
	public void getAccounts() {
		List<Account> accounts = accountService.getAccounts();
		
		System.out.println("accounts: " + accounts.size());
	}
	
}
