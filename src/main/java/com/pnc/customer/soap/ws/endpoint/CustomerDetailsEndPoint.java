package com.pnc.customer.soap.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pnc.customer.soap.ws.customer.CustomerDetailsRequest;
import com.pnc.customer.soap.ws.customer.CustomerDetailsResponse;
import com.pnc.customer.soap.ws.service.CustomerDetailsService;

@Endpoint
public class CustomerDetailsEndPoint {
	
	private static final String NAMESPACE = "http://www.pnc.com/customer/soap/ws/customer";
	
	@Autowired
	private CustomerDetailsService service;
	
	@PayloadRoot(namespace=NAMESPACE, localPart="CustomerDetailsRequest")
	@ResponsePayload
	public CustomerDetailsResponse getCustomerDetails(@RequestPayload CustomerDetailsRequest request) {
		
		return service.getCustomerDetails(request);
		
	}
}
