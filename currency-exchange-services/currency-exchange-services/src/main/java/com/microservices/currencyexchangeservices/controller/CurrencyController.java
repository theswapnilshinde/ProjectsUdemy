package com.microservices.currencyexchangeservices.controller;

import java.math.BigDecimal;
import java.util.Currency;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchangeservices.beans.CurrncyExchange;
import com.microservices.currencyexchangeservices.services.CurrencyService;

@RestController
public class CurrencyController {

	@Autowired
	private Environment environment;
	
	@Autowired
	CurrencyService currencyService;


	@GetMapping("currency-exchane/from/{from}/{to}")
	public CurrncyExchange retriveExchangeValue( 
			@PathVariable String from,
			@PathVariable String to) {

		CurrncyExchange currncyExchange = new CurrncyExchange(1000L,from,to,BigDecimal.valueOf(50));
	    String port=	environment.getProperty("local.server.port");
		currncyExchange.setEnvironment("8080");
		return  currncyExchange ;

	}
	
	@PostMapping("currency-exchane/add")
	public CurrncyExchange CreateExchangeValue(@RequestBody CurrncyExchange currency) {

		CurrncyExchange currncyExchange = currency;
	    String port=	environment.getProperty("local.server.port");
		currncyExchange.setEnvironment("8080");
		
		currencyService.add(currncyExchange);

		return  currncyExchange ;

	}

}
