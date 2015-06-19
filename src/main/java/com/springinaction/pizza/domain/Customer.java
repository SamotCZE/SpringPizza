package com.springinaction.pizza.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by hudectom on 22.4.2015.
 */

public @Data class Customer implements Serializable {

	private static final long serialVersionUID = 1L;


    private int id;
    private String  name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;

}
