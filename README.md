		Zendesk ticket support rest api automation
This framework is used to test the Zendesk RestFul API integration with their support ticket system. It uses Apache HTTP client to build a generic restful client with basic api token authentication.  The generic rest client is in the main package. This client contains methods to do post, get, delete requests. The http response json content  for each request is mapped to Java POJO classes with Jackson Object Mapper. Those POJO classes are utilitized in the tests.

The  Zendesk ticket API docuement is here: https://developer.zendesk.com/rest_api/docs/support/tickets

A. Classes and description:

class(package)

AllTickets(main)

This class maps to the http response content of the list request. It stores all the ticket information in a list

Ticket(main)

This class contains the information for a ticket in the AllTickets class.

TicketUtilities(main)

This static class contains methods that can return statistics of the system, for example the total number of tickets, 
all the ticket IDs, create a new ticket object.

NewTicket(main)	

This class maps to the http response content of the create request. It has the information of the new ticket in the system. 

RestClient(main)

This is a generic rest client based on Apache http client. It has methods to do post, get, delete. It uses api token to do basic authorization in the header as following:

	String encodedtoken = Base64.getEncoder().encodeToString(this.token.getBytes());
	Header authorizationHeader = new BasicHeader("Authorization", "Basic " + encodedtoken);

From(main)

element of the Ticket class.

Source(main)

element of the Ticket class. 

To(main)

element of the Ticket class.

Via(main)

element of the Ticket class.

Request(main)

element of the NewTicket class.

TicketTest(test)

This class contains all the junit tests.

B. Requirement to build and run the tests:


Install maven 3.5.4
Install Java 1.8
Clone and Download the repository.

Do a maven clean install
On your Java IDE, in the test package run the tests in TicketTest.java as Junit tests. 


C. Test cases documentation: All tests are in the TicketTest.java class in test package.

tests and description

testCreateATicket()	
1. Verify the http response code equals to 201	
2. Verify I can create a ticket
3. Verify I can add a comment to the ticket, and the comment is matched between the input and what is stored in the system
4. Verify the system has the new ticket ID

testListAllTickets()	
1. Verify the http response code equals to 200
2. Verify the system has 0 (at the beginning) or more tickets

testDeleteATicket()	
1. Verify the http response code equals to 201
2. Verify after the delete request based on ticket ID, the system doesn't have the deleted ID.
