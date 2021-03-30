package com.pnc.customer.soap.ws.service;

import org.springframework.stereotype.Service;

import com.pnc.customer.soap.ws.customer.Customer;
import com.pnc.customer.soap.ws.customer.CustomerDetailsRequest;
import com.pnc.customer.soap.ws.customer.CustomerDetailsResponse;


@Service
public class CustomerDetailsService {

	public CustomerDetailsResponse getCustomerDetails(CustomerDetailsRequest request) {
		
		CustomerDetailsResponse response = new CustomerDetailsResponse();
		System.out.println("Request received:: " + request.getName());
		if("abcd".equalsIgnoreCase(request.getName())) {
			Customer cust = new Customer();
			cust.setName("abcd");
			cust.setAccountnumber("123456");
			cust.setAddress("1234 Dallas TX 75075");
			cust.setCity("Dallas");
			cust.setPhone("1122334455");
			response.setCustomer(cust);
		} else if ("xyz".equalsIgnoreCase(request.getName())) {
			Customer cust = new Customer();
			cust.setName("xyz");
			cust.setAccountnumber("987654");
			cust.setAddress("55 W Peekway Rd  New York NY 99075");
			cust.setCity("New York");
			cust.setPhone("9988776655");
			response.setCustomer(cust);
		} else {
			Customer cust = new Customer();
			cust.setName("dummy");
			cust.setAccountnumber("dummy");
			cust.setAddress("dummy");
			cust.setCity("dummy");
			cust.setPhone("dummy");
			response.setCustomer(cust);
		}
		
		return response;
		
	}
}
