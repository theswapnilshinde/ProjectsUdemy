package com.microservices.currencyexchangeservices.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchangeservices.beans.CuurncyExchange;

@RestController
public class CurrencyController {
	
	@GetMapping("currency-exchane/from/{from}/{to}")
	public CuurncyExchange retriveExchangeValue( 
			@PathVariable String from,
			@PathVariable String to
			) {
				return new CuurncyExchange(1000L,from,to,BigDecimal.valueOf(50));
		
	}

	

}
