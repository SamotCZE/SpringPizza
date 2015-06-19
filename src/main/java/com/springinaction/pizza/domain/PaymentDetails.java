package com.springinaction.pizza.domain;

import java.io.Serializable;

import lombok.Data;

public @Data class PaymentDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	public PaymentType paymentType;
	private String creditCardNumber;
	
}
