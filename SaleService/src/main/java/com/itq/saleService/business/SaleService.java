package com.itq.saleService.business;

import org.springframework.stereotype.Component;

import com.itq.saleService.dto.Ack;
import com.itq.saleService.dto.Sale;

@Component
public class SaleService {
	
	public Ack insertSale(Sale sale) {
		Ack ack = new Ack();
		
		System.out.println("Nombre recibido: '" + sale.getProviderID() + "'");
		/*
		
		if (user.getName().equals("") || user.getLastname().equals("")) {
			ack.setDescription("ERROR: Ingrese un valor valido");
			ack.setCode(1);
			return ack;
		}
		
		if (user.getName() != "") {
			ack.setDescription("Usuario registrado correctamente!!");
		}
		*/
		ack.setCode(0);
		
		return ack;
	}

}
