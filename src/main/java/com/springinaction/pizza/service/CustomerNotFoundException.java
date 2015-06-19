package com.springinaction.pizza.service;

/**
 * Created by hudectom on 22.4.2015.
 */
@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException() { }

    public CustomerNotFoundException(String message) {
        super(message);
    }

}
