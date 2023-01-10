package com.microservisess.webservies.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservisess.webservies.limitservice.bean.Limits;
import com.microservisess.webservies.limitservice.confing.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrivelimits()
	{
		return new Limits(10,20);
		
	}
	
	@GetMapping("/limitscon")
	public Limits retrivelimitsConfig()
	{
		return new Limits(configuration.getMinimum(),
				          configuration.getMaximum()
				);
		
	}
	

}
