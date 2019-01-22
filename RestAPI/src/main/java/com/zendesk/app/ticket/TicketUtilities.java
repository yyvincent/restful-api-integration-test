package com.zendesk.app.ticket;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * This is a ticket ulitity class.
 *
 * @author vyuen
 */
public class TicketUtilities {
	final static Logger logger = Logger.getLogger(TicketUtilities.class);

	/**
	 * Get the total number of tickets in the system based on a http request response.
	 * @param HttpResponse http response of a http request
	 * @return number of tickets=
	 */
	public static int getNumberOfTickets(HttpResponse response) {
		int numberOfTickets = 0;
		ObjectMapper objectMapper = new ObjectMapper(); 
		HttpEntity testEntity = response.getEntity();
		try {
			String responseContent = EntityUtils.toString(testEntity);
			AllTickets allTickets = objectMapper.readValue(responseContent, AllTickets.class);
			numberOfTickets = allTickets.getTickets().size();
			logger.debug("The current number of tickets in the system is " + numberOfTickets);
		} catch (Exception e) {
			logger.debug("The exception here is " + e.getMessage());
		} 
		return numberOfTickets;
	}

	/**
	 * Get all the ticket IDs in the system based on a http request response.
	 * @param HttpResponse http response of a http request
	 * @return A list of all the ticket IDs
	 */
	public static List<BigInteger> getAllTicketIDs(HttpResponse response) {
		List<BigInteger> allTicketIDs = new ArrayList<BigInteger>();
		ObjectMapper objectMapper = new ObjectMapper(); 
		HttpEntity testEntity = response.getEntity();
		try {
			String responseContent = EntityUtils.toString(testEntity);
			logger.info("The response content is " + responseContent);
			AllTickets allTickets = objectMapper.readValue(responseContent, AllTickets.class);
			int numberOfTickets = allTickets.getTickets().size();
			logger.debug("The current number of tickets in the system is " + numberOfTickets);
			for (Ticket t: allTickets.getTickets()) {
				allTicketIDs.add((t.getId()));
			}

		} catch (Exception e) {
			logger.debug("The exception here is " + e.getMessage());
		} 

		return allTicketIDs;
	}

	/**
	 * Map to a pojo class of a http response from a create request 
	 * @param HttpResponse http response of a http request
	 * @return a NewTicket object
	 */
	public static NewTicket getNewTicket(HttpResponse response) {
		NewTicket newTicket = null;
		ObjectMapper objectMapper = new ObjectMapper(); 
		HttpEntity testEntity = response.getEntity();
		try {
			String responseContent = EntityUtils.toString(testEntity);
			logger.info("The response content is " + responseContent);
			newTicket = objectMapper.readValue(responseContent, NewTicket.class);
		} catch (Exception e) {
			logger.debug("The exception here is " + e.getMessage());
		} 

		return newTicket;
	}

}
