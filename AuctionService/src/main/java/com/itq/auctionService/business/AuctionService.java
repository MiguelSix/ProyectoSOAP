package com.itq.auctionService.business;

import org.springframework.stereotype.Component;

import com.itq.auctionService.dto.Ack;
import com.itq.auctionService.dto.Auction;

@Component
public class AuctionService {
	
	public Ack insertAuction(Auction auction) {
		Ack ack = new Ack();
		
		System.out.println("Nombre recibido: '" + auction.getProviderID() + "'");
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
