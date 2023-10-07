package com.itq.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.userService.business.UserService;
import com.itq.userService.dto.Ack;
import com.itq.userService.dto.User;

@Endpoint
public class UsersEndpoint {

	private static final String NAMESPACE_URI = "http://com.userSchema";
	@Autowired UserService userService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "User")
	@ResponsePayload
	
	public Ack userRegistration(@RequestPayload User request) {
		
		Ack response = userService.insertUser(request); 
		return response;
		
	}

}
