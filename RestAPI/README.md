		zendesk ticket support rest api automation
This framework is used to test the Zendesk RestFul API integration with their support ticket system. It uses Zendesk Restful APIs to create, list and delete support tickets in their system. It uses Apache HTTP client to build a custome generic restful client with api token authentication.  The custom rest client is In the main directory. This client contains methods to perform post, get, delete requests. The http response json content is mapped to Java POJO class with Jackson Object Mapper. Those POJO classes will be utilitized in the tests.

class(package)		description
AllTickets(main)	This class maps to the http response content of the list request. It stores all the ticket 
                        information in a list
Ticket(main)		This class contains the information for a ticket in the AllTickets class.
TicketUtilities(main)   This static class contains methods that can return statistics of the system, for example
                        the total number of tickets, all the ticket ID, create a new ticket object.
NewTicket(main)		This class maps to the http response content of the create request. The create request will create a 			     new ticket in the system. It has the information of the new ticket in the system. 
RestClient(main)	This is a generic rest client based on Apache http client. It has methods to do post, get, delete.
                        It uses api token to do basic authorization in the header as following:

        		String encodedtoken = Base64.getEncoder().encodeToString(this.token.getBytes());
        		Header authorizationHeader = new BasicHeader("Authorization", "Basic " + encodedtoken);

From(main)		element of the Ticket class.
Source(main)	        element of the Ticket class. 	
To(main)                element of the Ticket class.
Via(main)               element of the Ticket class.
Request(main)           element of the NewTicket class. 
TicketTest(test)   	This class contains all the junit tests.

Requirement to build and run the tests:
Install maven 3.5.4
Install Java 1.8
Clone and Download the repository.

Do a maven clean install
On your Java IDE, in the test package run the tests in TicketTest.java as Junit tests. 

Test cases documentation: All tests are in the TicketTest.java class in test package.

tests			description
testCreateATicket()     Verify the http response code equals to 201	
			Verify I can create a ticket
			Verify I can add a comment to the ticket, and the comment is matched 
                        between the input and what is stored in the system
                        Verify the system has the new ticket ID

testListAllTickets()	Verify the http response code equals to 200
                        Verify the system has 0 (at the beginning) or more tickets

testDeleteATicket()	Verify the http response code equals to 201
                        Verify after the delete request based on ticket ID, the system doesn't have the deleted 			ID.
