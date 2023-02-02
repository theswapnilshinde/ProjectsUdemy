package com.example.Conversion.Microservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Conversion.Microservice.Bean.CurrencyConversion;
// step 17 in invoking currency exchange from  onother service 
@RestController
public class CurrencyController {

	@GetMapping("/currency-exchane/from/USD/to")
	public CurrencyConversion claculator(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable  BigDecimal quantity

			) {

		HashMap<String, String> userVarible = new HashMap<>();
		userVarible.put("from",from);
		userVarible.put("to", to);

		ResponseEntity<CurrencyConversion> responceEntity =new RestTemplate().getForEntity("http://localhost:8000/currency-exchane/from/USD/to", 
				CurrencyConversion.class,userVarible);

		CurrencyConversion currencyConversion =responceEntity.getBody();


		return new CurrencyConversion(currencyConversion.getId(), from, to,quantity, 
				currencyConversion.getConversionMultiple(),
				quantity.multiply(currencyConversion.getConversionMultiple()),
				currencyConversion.getEnvironment());

	}



}
