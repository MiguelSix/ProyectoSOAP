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
		public Ack processAuctionRequest(@RequestPayload Auction request) {
			
			if (!request.getAuctionID().equals("")) {
				if (hasFieldsForModification(request)) {
					return auctionService.modifyAuction(request);
				} else if (hasFieldsForConsult(request)) {
					return auctionService.consultAuction(request.getAuctionID());
				} else {
					return auctionService.deleteAuction(request.getAuctionID());
				}
			} else {
				return auctionService.insertAuction(request);
			}
		}

		private boolean hasFieldsForConsult(Auction request) {

			if(!request.getAuctionID().equals("") && !request.getAuctionDate().equals("")) {
				return true;
			}

			return false; 
		}
		private boolean hasFieldsForModification(Auction request) {

			if(!request.getAuctionID().equals("") && !request.getProviderID().equals("")) {
				return true;
			}
			
			return false;
		}
}
