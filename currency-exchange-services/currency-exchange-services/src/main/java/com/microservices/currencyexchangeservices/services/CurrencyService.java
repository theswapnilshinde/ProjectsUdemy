package com.microservices.currencyexchangeservices.services;



import org.springframework.stereotype.Service;

import com.microservices.currencyexchangeservices.beans.CurrncyExchange;

@Service
public interface CurrencyService {
	
	CurrncyExchange add(CurrncyExchange currency);
}
