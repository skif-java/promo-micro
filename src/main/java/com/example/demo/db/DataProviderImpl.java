package com.example.demo.db;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.domain.Account;

public class DataProviderImpl implements DataProvider {

	@Override
	public List<Account> getAccounts() {
		List<Account> accounts = new ArrayList<>();
		
		Account account = new Account();
		account.setId(1);
		account.setName("ChaseX");
		accounts.add(account);
		
	    account = new Account();
		account.setId(2);
		account.setName("BarclaysX");
		accounts.add(account);
		
		return accounts;
	}
}
