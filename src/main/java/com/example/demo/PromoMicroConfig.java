package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.business.AccountService;
import com.example.demo.business.AccountServiceImpl;
import com.example.demo.db.DataProvider;
import com.example.demo.db.DataProviderImpl;

@Configuration
public class PromoMicroConfig {
	
    @Bean
    @Scope("singleton")
    public DataProvider dataProvider() {
        return new DataProviderImpl();
    }
	
    @Bean
    @Scope("singleton")
    public AccountService accountService() {
        return new AccountServiceImpl(dataProvider());
    }    
	
}
