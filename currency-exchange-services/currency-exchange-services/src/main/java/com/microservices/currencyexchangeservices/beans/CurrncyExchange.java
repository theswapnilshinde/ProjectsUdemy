package com.microservices.currencyexchangeservices.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.micrometer.core.annotation.Counted;



@Entity
public class CurrncyExchange {
	
	
	@Id
	private Long id;
	
	@Column(name="micro_from")
	private String form;
	
	@Column(name="micro_to")
	private String to;
	private BigDecimal conversionMultiple;
	private String environment;
	
	public CurrncyExchange(Long id, String form, String to, BigDecimal conversionMultiple, String environment) {
		super();
		this.id = id;
		this.form = form;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.environment = environment;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public CurrncyExchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrncyExchange(Long id, String form, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.form = form;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	@Override
	public String toString() {
		return "CuurncyExchange [id=" + id + ", form=" + form + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + "]";
	}

}
