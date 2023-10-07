package com.itq.auctionService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.auctionService.business.AuctionService;
import com.itq.auctionService.dto.Ack;
import com.itq.auctionService.dto.Auction;

@Endpoint
public class AuctionsEndpoint {

		private static final String NAMESPACE_URI = "http://com.auctionSchema";
		@Autowired AuctionService auctionService;
		
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "auction")
		@ResponsePayload
		
		public Ack productRegistration(@RequestPayload Auction request) {
			
			Ack response = auctionService.insertAuction(request); 
			return response;
		}
}
