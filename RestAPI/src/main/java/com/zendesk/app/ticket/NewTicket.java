package com.zendesk.app.ticket;

import java.util.HashMap;
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
	"request"
})

/**
* This is a pojo class for the API create request response content. The response of the create request is stored in this class
*
* @author vyuen
*/

/*
* A sample of the http create request is shown below:
{"request": {"requester": {"name": "Vincent Yuen"},"subject":
"Delete test","comment": {"body": "Test for creating a  ticket" }}}
*/

/*
* A sample of http response is shown below:
{"request":{"url":"https://yyvincent.zendesk.com/api/v2/requests/49.json","id":49,"status":"open",
	"priority":null,"type":null,"subject":"Delete test","description":"Test for creating a  ticket",
	"organization_id":null,"via":{"channel":"api","source":{"from":{},"to":{},"rel":null}},
	"custom_fields":[],"requester_id":375942234252,"collaborator_ids":[],"email_cc_ids":[],
	"is_public":true,"due_at":null,"can_be_solved_by_me":false,"created_at":"2019-01-23T21:16:09Z",
	"updated_at":"2019-01-23T21:16:09Z","recipient":null,"followup_source_id":null,
	"assignee_id":375829672631,"fields":[]}}
*/

public class NewTicket {

	@JsonProperty("request")
	private Request request;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("request")
	public Request getRequest() {
		return request;
	}

	@JsonProperty("request")
	public void setRequest(Request request) {
		this.request = request;
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
		return new ToStringBuilder(this).append("request", request).append("additionalProperties", additionalProperties).toString();
	}

}