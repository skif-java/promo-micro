package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.business.AccountService;
import com.example.demo.business.AccountServiceImpl;
import com.example.demo.db.DataProvider;
import com.example.demo.db.DataProviderMock;

@Configuration		
public class PromoMicroConfigTest {

	    @Bean
	    @Scope("singleton")
	    public DataProvider dataProvider() {
	        return new DataProviderMock();
	    }

	    @Bean
	    @Scope("singleton")
	    public AccountService accountService() {
	        return new AccountServiceImpl(dataProvider());
	    }  	
	
}
