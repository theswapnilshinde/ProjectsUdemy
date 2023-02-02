package com.example.Conversion.Microservice.Bean;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String form;
	private String to;
	private BigDecimal conversionMultiple; 
	private BigDecimal quantity;
	private BigDecimal toatalCalculataedAmount;
	private String environment;
	
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getToatalCalculataedAmount() {
		return toatalCalculataedAmount;
	}
	public void setToatalCalculataedAmount(BigDecimal toatalCalculataedAmount) {
		this.toatalCalculataedAmount = toatalCalculataedAmount;
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
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	public CurrencyConversion(Long id, String form, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal toatalCalculataedAmount, String environment) {
		super();
		this.id = id;
		this.form = form;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.toatalCalculataedAmount = toatalCalculataedAmount;
		this.environment = environment;
	}
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
