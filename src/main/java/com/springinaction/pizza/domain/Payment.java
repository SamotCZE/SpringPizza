package com.springinaction.pizza.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by hudectom on 22.4.2015.
 */
public @Data class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private float amount;
}
