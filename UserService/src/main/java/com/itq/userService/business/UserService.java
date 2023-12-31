package com.itq.userService.business;

import org.springframework.stereotype.Component;

import com.itq.userService.dto.Ack;
import com.itq.userService.dto.User;

@Component
public class UserService {

	String msg;
	// Metodo bool para validar que los datos del usuario sean validos
	public boolean isValid(User user) {

		// Restricciones para el campo del nombre y apellido del usuario basadas en el xsd
		if (user.getName().matches(".*\\d.*") || user.getLastname().matches(".*\\d.*")) {
			msg = "ERROR: El nombre y apellido no pueden contener numeros";
			return false;
		}

		if (user.getName().matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*") || user.getLastname().matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")) {
			msg = "ERROR: El nombre y apellido no pueden contener caracteres especiales";
			return false;
		}

		if (user.getName().equals("") || user.getLastname().equals("")) {
			msg = "ERROR: El nombre y apellido no puede estar vacio";
			return false;
		}

		// Restricciones para el campo de la direccion del usuario basadas en el xsd

		if (user.getAddress().equals("")) {
			msg = "ERROR: La direccion no puede estar vacia";
			return false;
		}

		// Restricciones para el campo del telefono del usuario basadas en el xsd

		if (user.getPhone().toString().length() > 10) {
			msg = "ERROR: El telefono no puede tener mas de 10 caracteres";
			return false;
		}

		if (user.getPhone().toString().matches(".*[a-zA-Z].*")) {
			msg = "ERROR: El telefono no puede contener letras";
			return false;
		}

		if (user.getPhone().toString().equals("")) {
			msg = "ERROR: El telefono no puede estar vacio";
			return false;
		}

		// Restricciones para el campo del email del usuario basadas en el xsd

		if (!user.getMail().matches("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$")) {
			msg = "ERROR: El email no es valido";
			return false;
		}

		if (user.getMail().equals("")) {
			msg = "ERROR: El email no puede estar vacio";
			return false;
		}

		// Restricciones para el campo del rfc del usuario basadas en el xsd

		if (!user.getRfc().matches("^([A-Z,Ñ,&amp;]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$")) {
			msg = "ERROR: El RFC no es valido";
			return false;
		}

		// Restricciones para el campo de la contraseña del usuario basadas en el xsd

		if (!user.getPassword().matches("^.{8,15}$")) {
			msg = "ERROR: La contraseña no es valida";
			return false;
		}

		if (user.getPassword().equals("")) {
			msg = "ERROR: La contraseña no puede estar vacia";
			return false;
		}

		// Restricciones para el campo del tipo de usuario basadas en el xsd

		if (!user.getType().equals("cliente") && !user.getType().equals("proveedor")) {
			msg = "ERROR: El tipo de usuario no es valido";
			return false;
		}

		return true;
	}

	// Crear un usuario
	public Ack insertUser(User user) {
		System.out.println("Inserting user...");
		Ack ack = new Ack();

		if (isValid(user)) {
			ack.setDescription("Usuario registrado correctamente");
			ack.setCode(1);
		} else {
			ack.setDescription(msg);
			ack.setCode(0);
		}
		return ack;
	}

	// Eliminar un usuario
	public Ack deleteUser(String userID) {
		System.out.println("Deleting user...");
		Ack ack = new Ack();

		if (userID == "") {
			ack.setDescription("ERROR: El ID del usuario no puede estar vacio");
			ack.setCode(0);
		} else {
			ack.setDescription("Usuario eliminado correctamente");
			ack.setCode(1);
		}
		
		return ack;
	}

	// Modificar un usuario
	public Ack modifyUser(User user) {
		System.out.println("Modifying user...");
		Ack ack = new Ack();
		
		user.setType("cliente"); 	//En este caso, ya existe el usuario con tipo, por lo que simulamos esa situacion

		if (isValid(user)) {
			ack.setDescription("Usuario modificado correctamente");
			ack.setCode(1);
		} else {
			ack.setDescription(msg);
			ack.setCode(0);
		}
		
		return ack;
	}

	// Consultar un usuario

	public Ack consultUser(String userID) {
		System.out.println("Consulting user...");
		Ack ack = new Ack();

		if (userID == "") {
			ack.setDescription("ERROR: El ID del usuario no puede estar vacio");
			ack.setCode(0);
		} else {
			ack.setDescription("Usuario encontrado");
			ack.setCode(1);
		}
		
		return ack;
	}

}
