package com.springinaction.pizza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springinaction.pizza.domain.Customer;

/**
 * Created by hudectom on 24.4.2015.
 */
@Component
public class CustomerServiceImpl implements CustomerService {

	List<Customer> customers;
	
    public CustomerServiceImpl() {
    	customers = new ArrayList<Customer>();    	
    }

    @Override
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        
    	for (Customer customer : customers) {
    		if (customer.getPhoneNumber().equals(phoneNumber))
    			return customer;    		
    	}
    	throw new CustomerNotFoundException();
	}
    
    @Override
    public void addNewCustomer(Customer customer) {
    	customers.add(customer);
    }
}
