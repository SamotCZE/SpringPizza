package com.springinaction.pizza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DeliveryServiceImpl implements DeliveryService {

	List<String> deliveryAreas;
	
	public DeliveryServiceImpl() {
		deliveryAreas = new ArrayList<String>();
		deliveryAreas.add("73514");
		deliveryAreas.add("73200");
	}

	@Override
	public boolean checkDeliveryArea(String zipCode) {
		return deliveryAreas.contains(zipCode);
	}
	
	
}
