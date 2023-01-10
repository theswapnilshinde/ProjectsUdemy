package com.microservices.currencyexchangeservices.beans;

import java.math.BigDecimal;

public class CuurncyExchange {
	
	private Long id;
	private String form;
	private String to;
	private BigDecimal conversionMultiple;
	public CuurncyExchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CuurncyExchange(Long id, String form, String to, BigDecimal conversionMultiple) {
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
