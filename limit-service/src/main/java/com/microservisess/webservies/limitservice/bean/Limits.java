package com.microservisess.webservies.limitservice.bean;

import lombok.Data;

//@Data
public class Limits {

	private int minimum;
	private int maximum;

	public Limits(int min, int max) {

		this.minimum = min;
		this.maximum = max;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	@Override
	public String toString() {
		return "Limits [minimum=" + minimum + ", maximum=" + maximum + "]";
	}

}
