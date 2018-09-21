package com.example.demo.business;

import java.util.List;
//import org.springframework.stereotype.Service;

import com.example.demo.db.DataProvider;
import com.example.demo.domain.Account;

public class AccountServiceImpl implements AccountService {

	private DataProvider dataProvider;
	
	public AccountServiceImpl(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	@Override
	public List<Account> getAccounts() {
		List<Account> accounts = dataProvider.getAccounts();
		return accounts;
	}
}
