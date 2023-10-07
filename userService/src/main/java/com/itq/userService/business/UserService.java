package com.itq.userService.business;

import org.springframework.stereotype.Component;

import com.itq.userService.dto.Ack;
import com.itq.userService.dto.User;

@Component
public class UserService {
	
	public Ack insertUser(User user) {
		Ack ack = new Ack();
		
		System.out.println("Nombre recibido: '" + user.getName() + "'");

		if (user.getName().equals("") || user.getLastname().equals("")) {
			ack.setDescription("ERROR: Ingrese un valor valido");
			ack.setCode(1);
			return ack;
		}
		
		if (user.getName() != "") {
			ack.setDescription("Usuario registrado correctamente!!");
		}
		
		ack.setCode(0);
		
		return ack;
	}

}
