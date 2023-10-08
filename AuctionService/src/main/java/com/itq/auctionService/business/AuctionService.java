package com.itq.auctionService.business;

import org.springframework.stereotype.Component;

import com.itq.auctionService.dto.Ack;
import com.itq.auctionService.dto.Auction;

@Component
public class AuctionService {

	String msg;

	public boolean validateAuction(Auction auction) {

		// Validar el ID del proveedor
		if (auction.getProviderID().equals("")) {
			msg = "ERROR: El ID del proveedor no puede estar vacío";
			return false;
		}

		// Validar el ID del producto
		if (auction.getProductID().equals("")) {
			msg = "ERROR: El ID del producto no puede estar vacío";
			return false;
		}

		// Validar la fecha
		if (!auction.getAuctionDate().matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
			msg = "ERROR: La fecha no tiene el formato correcto (dd-mm-yyyy)";
			return false;
		}

		// Validar el estado
		
		if (!auction.getStatus().equals("Activa") && !auction.getStatus().equals("Inactiva")) {
			msg = "ERROR: Ingrese un estado valido (Activa/Inactiva)";
			return false;
		}
		

		return true;
	}

	// Method for search an action by id

	public Auction searchAuction(String auctionID) {
		// Aqui va la lógica para buscar una subasta
		Auction auction = new Auction();
		return auction;
	}
	
	public Ack insertAuction(Auction auction) {
		Ack ack = new Ack();
		System.out.println("Creating an auction...");
		if (validateAuction(auction)) {
			ack.setCode(0);
			ack.setDescription("Auction created");
		} else {
			ack.setCode(1);
			ack.setDescription(msg);
		}
		return ack;
	}
	
	public Ack deleteAuction(String auctionID) {
		Ack ack = new Ack();
		System.out.println("Deleting an auction...");
		ack.setCode(0);
		ack.setDescription("Auction with ID:" + auctionID + " was deleted");
		return ack;
	}
	
	public Ack modifyAuction(Auction auction) {
		Ack ack = new Ack();
		System.out.println("Modifying an auction...");

		if (validateAuction(auction)) {
			ack.setCode(0);
			ack.setDescription("Auction modified");
		} else {
			ack.setCode(1);
			ack.setDescription(msg);
		}
		return ack;
	}
	
	public Ack consultAuction(String auctionID) {
		Ack ack = new Ack();
		System.out.println("Consulting an auction...");

		if (searchAuction(auctionID) != null) {
			Auction searchAuction = searchAuction(auctionID);
			String result = "/nDate: " + searchAuction.getAuctionDate() + "/nProduct: " + searchAuction.getProductID() + "/nProvider: " + searchAuction.getProviderID() + "/nActualBid: " + searchAuction.getFinalPrice();
			ack.setCode(0);
			ack.setDescription("Auction found" + result);
		} else {
			ack.setCode(1);
			ack.setDescription("Auction not found");
		}
		return ack;
	}
}
