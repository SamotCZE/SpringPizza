package com.springinaction.pizza.flow;

import static org.apache.log4j.Logger.getLogger;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springinaction.pizza.domain.CashOrCheckPayment;
import com.springinaction.pizza.domain.CreditCardPayment;
import com.springinaction.pizza.domain.Customer;
import com.springinaction.pizza.domain.Order;
import com.springinaction.pizza.domain.Payment;
import com.springinaction.pizza.domain.PaymentDetails;
import com.springinaction.pizza.domain.PaymentType;
import com.springinaction.pizza.service.CustomerNotFoundException;
import com.springinaction.pizza.service.CustomerService;
import com.springinaction.pizza.service.DeliveryService;

/**
 * Created by hudectom on 24.4.2015.
 */
@Component
public class PizzaFlowActions {

    private static final Logger LOGGER = getLogger(PizzaFlowActions.class);

    @Autowired
    CustomerService customerService;
    
    @Autowired
    DeliveryService deliveryService;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {

        Customer customer = customerService.lookupCustomer(phoneNumber);

        if (customer != null) {
            return customer;
        } else {
            throw new CustomerNotFoundException();
        }
    }    
    
    public boolean checkDeliveryArea(String zipCode) {
         return deliveryService.checkDeliveryArea(zipCode);
    }

    public void addCustomer(Customer customer) {
    	customerService.addNewCustomer(customer);
    }
    
    public Payment verifyPayment(PaymentDetails paymentDetails) {
    	Payment payment = null;
    	
    	if (paymentDetails.getPaymentType() == PaymentType.CREDIT_CARD) {
    		payment = new CreditCardPayment();			
		} else {
			payment = new CashOrCheckPayment();
		}
    	
    	return payment;
    }
    
    public void saveOrder(Order order) {
    	LOGGER.warn("TODO: Flesh out the saveOrder() method.");
    }

}
