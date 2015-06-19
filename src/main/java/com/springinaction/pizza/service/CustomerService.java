package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Customer;

/**
 * Created by hudectom on 24.4.2015.
 */
public interface CustomerService {

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
    public void addNewCustomer(Customer customer);
}
