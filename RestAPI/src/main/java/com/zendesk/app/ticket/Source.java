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
	"from",
	"to",
	"rel"
})

/**
* This is part of the Ticket class.
*
* @author vyuen
*/
public class Source {

	@JsonProperty("from")
	private From from;
	@JsonProperty("to")
	private To to;
	@JsonProperty("rel")
	private Object rel;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("from")
	public From getFrom() {
		return from;
	}

	@JsonProperty("from")
	public void setFrom(From from) {
		this.from = from;
	}

	@JsonProperty("to")
	public To getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(To to) {
		this.to = to;
	}

	@JsonProperty("rel")
	public Object getRel() {
		return rel;
	}

	@JsonProperty("rel")
	public void setRel(Object rel) {
		this.rel = rel;
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
		return new ToStringBuilder(this).append("from", from).append("to", to).append("rel", rel).append("additionalProperties", additionalProperties).toString();
	}

}