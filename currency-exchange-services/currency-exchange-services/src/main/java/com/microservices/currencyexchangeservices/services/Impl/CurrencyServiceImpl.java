package com.microservices.currencyexchangeservices.services.Impl;

import java.util.Currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.currencyexchangeservices.beans.CurrncyExchange;
import com.microservices.currencyexchangeservices.repo.CurrencyServiceRepo;
import com.microservices.currencyexchangeservices.services.CurrencyService;

@Service
public class CurrencyServiceImpl implements CurrencyService {
	
	@Autowired
	public CurrencyServiceRepo repo;

	@Override
	public CurrncyExchange add(CurrncyExchange currency) {
		CurrncyExchange currency2 = currency ;		
		 repo.save(currency2);
		 return currency2;
	}
	
	
	
//	public Currency add(Currency currency)
//	{
//		Currency currency2 = currency ;
//		
//		return repo.save(currency2);
//		
//	}
//	
	
}
