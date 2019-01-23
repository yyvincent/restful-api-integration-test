package com.zendesk.app.ticket;

import java.util.HashMap;


import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"tickets",
	"next_page",
	"previous_page",
	"count"
})

/**
* This is a pojo class for the API list request. The response of the list request is stored in this class.
* It stores all the ticket information in a list.
* @author vyuen
*/

/*A sample of the list request response looks like the following:
{
	  "tickets": [
	    {
	      "url": "https://yyvincent.zendesk.com/api/v2/tickets/1.json",
	      "id": 1,
	      "external_id": null,
	      "via": {
	        "channel": "sample_ticket",
	        "source": {
	          "from": {},
	          "to": {},
	          "rel": null
	        }
	      },
	      "created_at": "2019-01-20T23:37:51Z",
	      "updated_at": "2019-01-20T23:37:51Z",
	      "type": "incident",
	      "subject": "Sample ticket: Meet the ticket",
	      "raw_subject": "Sample ticket: Meet the ticket",
	      "description": "Hi Vincent,\n\nEmails, chats, voicemails, and tweets are captured in Zendesk Support as tickets. Start typing above to respond and click Submit to send. To test how an email becomes a ticket, send a message to support@yyvincent.zendesk.com.\n\nCurious about what your customers will see when you reply? Check out this video:\nhttps://demos.zendesk.com/hc/en-us/articles/202341799\n",
	      "priority": "normal",
	      "status": "open",
	      "recipient": null,
	      "requester_id": 375784786052,
	      "submitter_id": 375829672631,
	      "assignee_id": 375829672631,
	      "organization_id": null,
	      "group_id": 360003654471,
	      "collaborator_ids": [],
	      "follower_ids": [],
	      "email_cc_ids": [],
	      "forum_topic_id": null,
	      "problem_id": null,
	      "has_incidents": false,
	      "is_public": true,
	      "due_at": null,
	      "tags": [
	        "sample",
	        "support",
	        "zendesk"
	      ],
	      "custom_fields": [],
	      "satisfaction_rating": null,
	      "sharing_agreement_ids": [],
	      "fields": [],
	      "followup_ids": [],
	      "brand_id": 360002107791,
	      "allow_channelback": false,
	      "allow_attachments": true
	    },
	    {
	      "url": "https://yyvincent.zendesk.com/api/v2/tickets/22.json",
	      "id": 22,
	      "external_id": null,
	      "via": {
	        "channel": "api",
	        "source": {
	          "from": {},
	          "to": {},
	          "rel": null
	        }
	      },
	      "created_at": "2019-01-21T08:38:27Z",
	      "updated_at": "2019-01-21T08:38:27Z",
	      "type": null,
	      "subject": "My ABc test",
	      "raw_subject": "My ABc test",
	      "description": "Test for the first ticket",
	      "priority": null,
	      "status": "open",
	      "recipient": null,
	      "requester_id": 375862625851,
	      "submitter_id": 375829672631,
	      "assignee_id": 375829672631,
	      "organization_id": null,
	      "group_id": 360003654471,
	      "collaborator_ids": [],
	      "follower_ids": [],
	      "email_cc_ids": [],
	      "forum_topic_id": null,
	      "problem_id": null,
	      "has_incidents": false,
	      "is_public": true,
	      "due_at": null,
	      "tags": [],
	      "custom_fields": [],
	      "satisfaction_rating": null,
	      "sharing_agreement_ids": [],
	      "fields": [],
	      "followup_ids": [],
	      "brand_id": 360002107791,
	      "allow_channelback": false,
	      "allow_attachments": true
	    },
	    {
	      "url": "https://yyvincent.zendesk.com/api/v2/tickets/23.json",
	      "id": 23,
	      "external_id": null,
	      "via": {
	        "channel": "api",
	        "source": {
	          "from": {},
	          "to": {},
	          "rel": null
	        }
	      },
	      "created_at": "2019-01-21T08:53:16Z",
	      "updated_at": "2019-01-21T08:53:16Z",
	      "type": null,
	      "subject": "Delete test",
	      "raw_subject": "Delete test",
	      "description": "Test for the first ticket",
	      "priority": null,
	      "status": "open",
	      "recipient": null,
	      "requester_id": 375803701072,
	      "submitter_id": 375829672631,
	      "assignee_id": 375829672631,
	      "organization_id": null,
	      "group_id": 360003654471,
	      "collaborator_ids": [],
	      "follower_ids": [],
	      "email_cc_ids": [],
	      "forum_topic_id": null,
	      "problem_id": null,
	      "has_incidents": false,
	      "is_public": true,
	      "due_at": null,
	      "tags": [],
	      "custom_fields": [],
	      "satisfaction_rating": null,
	      "sharing_agreement_ids": [],
	      "fields": [],
	      "followup_ids": [],
	      "brand_id": 360002107791,
	      "allow_channelback": false,
	      "allow_attachments": true
	    }
	  ],
	  "next_page": null,
	  "previous_page": null,
	  "count": 21
	}
*/

public class AllTickets {

	@JsonProperty("tickets")
	private List<Ticket> tickets = null;
	@JsonProperty("next_page")
	private Object nextPage;
	@JsonProperty("previous_page")
	private Object previousPage;
	@JsonProperty("count")
	private Integer count;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("tickets")
	public List<Ticket> getTickets() {
		return tickets;
	}

	@JsonProperty("tickets")
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@JsonProperty("next_page")
	public Object getNextPage() {
		return nextPage;
	}

	@JsonProperty("next_page")
	public void setNextPage(Object nextPage) {
		this.nextPage = nextPage;
	}

	@JsonProperty("previous_page")
	public Object getPreviousPage() {
		return previousPage;
	}

	@JsonProperty("previous_page")
	public void setPreviousPage(Object previousPage) {
		this.previousPage = previousPage;
	}

	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("tickets", tickets).append("nextPage", nextPage).append("previousPage", previousPage).append("count", count).append("additionalProperties", additionalProperties).toString();
	}

}