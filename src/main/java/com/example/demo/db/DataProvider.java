package com.example.demo.db;

import java.util.List;

import com.example.demo.domain.Account;

public interface DataProvider {

	List<Account> getAccounts();
	
}
