package com.microservisess.webservies.limitservice.confing;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix ="limits-service")
@ConfigurationPropertiesScan

public class Configuration {

	private int minimum;
	private int maximum;
	
	
	public Configuration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	@Override
	public String toString() {
		return "Configguration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
	
	
	
	
}
