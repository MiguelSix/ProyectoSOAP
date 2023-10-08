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

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "user")
	@ResponsePayload
	public Ack processUserRequest(@RequestPayload User request) {
		
		if (!request.getUserID().equals("")) {
			if (hasFieldsForModification(request)) {
				return userService.modifyUser(request);
			} else if (hasFieldsForConsult(request)) {
				return userService.consultUser(request.getUserID());
			} else {
				return userService.deleteUser(request.getUserID());
			}
		} else {
			return userService.insertUser(request);
		}
	}

	// Para consultar un usuario, solo se necesita el ID del usuario y el tipo
	private boolean hasFieldsForConsult(User request) {

		if(!request.getUserID().equals("") && !request.getType().equals("")) {
			return true;
		}

		return false; 
	}

	// Para modificar un usuario, solo se necesita el ID del usuario y el resto de campos llenos, menos el tipo de usuario
	private boolean hasFieldsForModification(User request) {

		if(!request.getUserID().equals("") && request.getType().equals("") && !request.getName().equals("") && !request.getLastname().equals("") && !request.getAddress().equals("") && 
		   !request.getPhone().toString().equals("") && !request.getMail().equals("") && !request.getRfc().equals("") && !request.getPassword().equals("")) {
			return true;
		}
		return false;
	}

}
