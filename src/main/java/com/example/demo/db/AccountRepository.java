package com.example.demo.db;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
