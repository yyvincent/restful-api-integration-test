package com.zendesk.app.ticket;

import java.math.BigInteger;
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
	"url",
	"id",
	"status",
	"priority",
	"type",
	"subject",
	"description",
	"organization_id",
	"via",
	"custom_fields",
	"requester_id",
	"collaborator_ids",
	"email_cc_ids",
	"is_public",
	"due_at",
	"can_be_solved_by_me",
	"created_at",
	"updated_at",
	"recipient",
	"followup_source_id",
	"assignee_id",
	"fields"
})

/**
* This is part of the NewTicket class.
*
* @author vyuen
*/
public class Request {

	@JsonProperty("url")
	private String url;
	@JsonProperty("id")
	private BigInteger id;
	@JsonProperty("status")
	private String status;
	@JsonProperty("priority")
	private Object priority;
	@JsonProperty("type")
	private Object type;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("description")
	private String description;
	@JsonProperty("organization_id")
	private Object organizationId;
	@JsonProperty("via")
	private Via via;
	@JsonProperty("custom_fields")
	private List<Object> customFields = null;
	@JsonProperty("requester_id")
	private BigInteger requesterId;
	@JsonProperty("collaborator_ids")
	private List<Object> collaboratorIds = null;
	@JsonProperty("email_cc_ids")
	private List<Object> emailCcIds = null;
	@JsonProperty("is_public")
	private Boolean isPublic;
	@JsonProperty("due_at")
	private Object dueAt;
	@JsonProperty("can_be_solved_by_me")
	private Boolean canBeSolvedByMe;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("recipient")
	private Object recipient;
	@JsonProperty("followup_source_id")
	private Object followupSourceId;
	@JsonProperty("assignee_id")
	private BigInteger assigneeId;
	@JsonProperty("fields")
	private List<Object> fields = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("id")
	public BigInteger getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(BigInteger id) {
		this.id = id;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("priority")
	public Object getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(Object priority) {
		this.priority = priority;
	}

	@JsonProperty("type")
	public Object getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Object type) {
		this.type = type;
	}

	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}

	@JsonProperty("subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("organization_id")
	public Object getOrganizationId() {
		return organizationId;
	}

	@JsonProperty("organization_id")
	public void setOrganizationId(Object organizationId) {
		this.organizationId = organizationId;
	}

	@JsonProperty("via")
	public Via getVia() {
		return via;
	}

	@JsonProperty("via")
	public void setVia(Via via) {
		this.via = via;
	}

	@JsonProperty("custom_fields")
	public List<Object> getCustomFields() {
		return customFields;
	}

	@JsonProperty("custom_fields")
	public void setCustomFields(List<Object> customFields) {
		this.customFields = customFields;
	}

	@JsonProperty("requester_id")
	public BigInteger getRequesterId() {
		return requesterId;
	}

	@JsonProperty("requester_id")
	public void setRequesterId(BigInteger requesterId) {
		this.requesterId = requesterId;
	}

	@JsonProperty("collaborator_ids")
	public List<Object> getCollaboratorIds() {
		return collaboratorIds;
	}

	@JsonProperty("collaborator_ids")
	public void setCollaboratorIds(List<Object> collaboratorIds) {
		this.collaboratorIds = collaboratorIds;
	}

	@JsonProperty("email_cc_ids")
	public List<Object> getEmailCcIds() {
		return emailCcIds;
	}

	@JsonProperty("email_cc_ids")
	public void setEmailCcIds(List<Object> emailCcIds) {
		this.emailCcIds = emailCcIds;
	}

	@JsonProperty("is_public")
	public Boolean getIsPublic() {
		return isPublic;
	}

	@JsonProperty("is_public")
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	@JsonProperty("due_at")
	public Object getDueAt() {
		return dueAt;
	}

	@JsonProperty("due_at")
	public void setDueAt(Object dueAt) {
		this.dueAt = dueAt;
	}

	@JsonProperty("can_be_solved_by_me")
	public Boolean getCanBeSolvedByMe() {
		return canBeSolvedByMe;
	}

	@JsonProperty("can_be_solved_by_me")
	public void setCanBeSolvedByMe(Boolean canBeSolvedByMe) {
		this.canBeSolvedByMe = canBeSolvedByMe;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("recipient")
	public Object getRecipient() {
		return recipient;
	}

	@JsonProperty("recipient")
	public void setRecipient(Object recipient) {
		this.recipient = recipient;
	}

	@JsonProperty("followup_source_id")
	public Object getFollowupSourceId() {
		return followupSourceId;
	}

	@JsonProperty("followup_source_id")
	public void setFollowupSourceId(Object followupSourceId) {
		this.followupSourceId = followupSourceId;
	}

	@JsonProperty("assignee_id")
	public BigInteger getAssigneeId() {
		return assigneeId;
	}

	@JsonProperty("assignee_id")
	public void setAssigneeId(BigInteger assigneeId) {
		this.assigneeId = assigneeId;
	}

	@JsonProperty("fields")
	public List<Object> getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(List<Object> fields) {
		this.fields = fields;
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
		return new ToStringBuilder(this).append("url", url).append("id", id).append("status", status).append("priority", priority).append("type", type).append("subject", subject).append("description", description).append("organizationId", organizationId).append("via", via).append("customFields", customFields).append("requesterId", requesterId).append("collaboratorIds", collaboratorIds).append("emailCcIds", emailCcIds).append("isPublic", isPublic).append("dueAt", dueAt).append("canBeSolvedByMe", canBeSolvedByMe).append("createdAt", createdAt).append("updatedAt", updatedAt).append("recipient", recipient).append("followupSourceId", followupSourceId).append("assigneeId", assigneeId).append("fields", fields).append("additionalProperties", additionalProperties).toString();
	}

}