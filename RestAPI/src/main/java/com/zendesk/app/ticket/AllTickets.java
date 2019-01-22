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