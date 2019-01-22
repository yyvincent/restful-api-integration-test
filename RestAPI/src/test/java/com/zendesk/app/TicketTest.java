package com.zendesk.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import org.apache.http.HttpResponse;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.zendesk.app.ticket.NewTicket;
import com.zendesk.app.ticket.TicketUtilities;

/**
 * This is a test class for the ticket rest api tests.
 *
 * @author vyuen
 */
public class TicketTest {
	final static Logger logger = Logger.getLogger(TicketTest.class);
	private static RestClient testClient = null;

	// api token
	private final static String token ="yyvincent@yahoo.com/token:oZMVCfLFES92roHF2CJjXBNcGg99faQXDFULNYKA";
	// Create request endpoint
	private final static String createEndPoint = "https://yyvincent.zendesk.com/api/v2/requests.json";
	// List request endpoint
	private final static String listEndPoint = "https://yyvincent.zendesk.com/api/v2/tickets.json";
	// The total number of tickets in the system.
	private int currentNumberOfTickets = 0;

	@Before
	public  void setUp() throws Exception {
		testClient = new RestClient(token);
		// Get the current total number of tickets in the system
		currentNumberOfTickets  = getCurrentNumberOfTickets();
		logger.info("There are current " + currentNumberOfTickets + " in the system");
	}

	@After
	public  void complete() {
		testClient.destroy();
	}

	/**
	 * Test the create api
	 */
	@Test 
	public void testCreateATicket() throws Exception {
		String createRequest =  "{\"request\": {\"requester\": {\"name\": \"Vincent Yuen\"},\"subject\": \"Delete test\",\"comment\": {\"body\": \"Test for creating a  ticket\" }}}";
		HttpResponse createResponse = testClient.getHttpPostResponseWithToken(createEndPoint,createRequest);
		// Verify the response code = 201
		assertTrue(createResponse.getStatusLine().getStatusCode() == 201);	

		// Verify one more ticket is created in the system.
		int updatedNumberOfTickets =  getCurrentNumberOfTickets();
		assertEquals((currentNumberOfTickets + 1 ), updatedNumberOfTickets );

		// Map the  response to a NewTicket object.
		NewTicket newTicket = TicketUtilities.getNewTicket(createResponse);

		// Verify the new ticket ID is in the system based on the list http response.
		List<BigInteger> allTicketIDs = getAllTicketIDs();
		BigInteger newTicketID = newTicket.getRequest().getId();
		assertTrue(allTicketIDs.contains(newTicketID));

		// Verify the comment in the new ticket is added based on the http response.
		String comment = newTicket.getRequest().getDescription();
		assertEquals("Test for creating a  ticket",comment);
	}


	/**
	 * Test the list api
	 */
	@Test 
	public void testListAllTickets() throws Exception {
		HttpResponse listResponse = testClient.getHttpGetResponse(listEndPoint);
		// Verify the response code = 200
		assertTrue(listResponse.getStatusLine().getStatusCode() == 200);	

		int currentNumber = TicketUtilities.getNumberOfTickets(listResponse);
		// Verify the return number is more than zero. At the beginning it will be zero.
		assertTrue(currentNumber >= 0);		
	}	


	/**
	 * Test the delete api: delete a ticket with random ID.
	 */	
	@Test 
	public void testDeleteATicket() throws Exception {
		// The random ticket id to delete
		BigInteger ticketID = getARandomTicketID();
		
	    // The delete api end point
		String DeleteRequest =  "https://yyvincent.zendesk.com//api/v2/tickets/" + ticketID + ".json";
		
		// Send the delete request
		HttpResponse deleteResponse = testClient.getHttpDeleteResponse(DeleteRequest);

		// Verify the response code = 201
		assertTrue(deleteResponse.getStatusLine().getStatusCode() == 204);	

		// Verify the specific ticket is no longer in the system.
		List<BigInteger> allTicketIDs = getAllTicketIDs();
		assertFalse(allTicketIDs.contains(ticketID));
	}

	/**
	 * Get the number of tickets in the system.
	 */	
	private int getCurrentNumberOfTickets() throws Exception {
		testClient = new RestClient(token);
		int numberOfTickets = -1;
		HttpResponse listResponse = testClient.getHttpGetResponse(listEndPoint);
		numberOfTickets = TicketUtilities.getNumberOfTickets(listResponse);
		return numberOfTickets;
	}

	/**
	 * Get all the ticket IDs in the system.
	 */	
	private List<BigInteger> getAllTicketIDs() throws Exception {
		testClient = new RestClient(token);
		HttpResponse listResponse = testClient.getHttpGetResponse(listEndPoint);
		List<BigInteger> allIDs =  TicketUtilities.getAllTicketIDs(listResponse);
		return allIDs;
	}

	/**
	 * Get a random ticket id among the existing tickets.
	 */	
	private BigInteger getARandomTicketID() throws Exception {
		List<BigInteger> allTicketIDs = getAllTicketIDs();
		Random rand = new Random();
		int randomIndex= rand.nextInt(allTicketIDs.size());

		return allTicketIDs.get(randomIndex);
	}

}
