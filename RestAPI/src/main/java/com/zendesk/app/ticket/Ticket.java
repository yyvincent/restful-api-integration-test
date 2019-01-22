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
	"external_id",
	"via",
	"created_at",
	"updated_at",
	"type",
	"subject",
	"raw_subject",
	"description",
	"priority",
	"status",
	"recipient",
	"requester_id",
	"submitter_id",
	"assignee_id",
	"organization_id",
	"group_id",
	"collaborator_ids",
	"follower_ids",
	"email_cc_ids",
	"forum_topic_id",
	"problem_id",
	"has_incidents",
	"is_public",
	"due_at",
	"tags",
	"custom_fields",
	"satisfaction_rating",
	"sharing_agreement_ids",
	"fields",
	"followup_ids",
	"brand_id",
	"allow_channelback",
	"allow_attachments"
})

/**
* This is part of the AllTickets class. It contains the information for one ticket in the system.
*
* @author vyuen
*/
public class Ticket {

	@JsonProperty("url")
	private String url;
	@JsonProperty("id")
	private BigInteger id;
	@JsonProperty("external_id")
	private Object externalId;
	@JsonProperty("via")
	private Via via;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("type")
	private Object type;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("raw_subject")
	private String rawSubject;
	@JsonProperty("description")
	private String description;
	@JsonProperty("priority")
	private Object priority;
	@JsonProperty("status")
	private String status;
	@JsonProperty("recipient")
	private Object recipient;
	@JsonProperty("requester_id")
	private BigInteger requesterId;
	@JsonProperty("submitter_id")
	private BigInteger submitterId;
	@JsonProperty("assignee_id")
	private BigInteger assigneeId;
	@JsonProperty("organization_id")
	private Object organizationId;
	@JsonProperty("group_id")
	private BigInteger groupId;
	@JsonProperty("collaborator_ids")
	private List<Object> collaboratorIds = null;
	@JsonProperty("follower_ids")
	private List<Object> followerIds = null;
	@JsonProperty("email_cc_ids")
	private List<Object> emailCcIds = null;
	@JsonProperty("forum_topic_id")
	private Object forumTopicId;
	@JsonProperty("problem_id")
	private Object problemId;
	@JsonProperty("has_incidents")
	private Boolean hasIncidents;
	@JsonProperty("is_public")
	private Boolean isPublic;
	@JsonProperty("due_at")
	private Object dueAt;
	@JsonProperty("tags")
	private List<String> tags = null;
	@JsonProperty("custom_fields")
	private List<Object> customFields = null;
	@JsonProperty("satisfaction_rating")
	private Object satisfactionRating;
	@JsonProperty("sharing_agreement_ids")
	private List<Object> sharingAgreementIds = null;
	@JsonProperty("fields")
	private List<Object> fields = null;
	@JsonProperty("followup_ids")
	private List<Object> followupIds = null;
	@JsonProperty("brand_id")
	private BigInteger brandId;
	@JsonProperty("allow_channelback")
	private Boolean allowChannelback;
	@JsonProperty("allow_attachments")
	private Boolean allowAttachments;
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

	@JsonProperty("external_id")
	public Object getExternalId() {
		return externalId;
	}

	@JsonProperty("external_id")
	public void setExternalId(Object externalId) {
		this.externalId = externalId;
	}

	@JsonProperty("via")
	public Via getVia() {
		return via;
	}

	@JsonProperty("via")
	public void setVia(Via via) {
		this.via = via;
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

	@JsonProperty("raw_subject")
	public String getRawSubject() {
		return rawSubject;
	}

	@JsonProperty("raw_subject")
	public void setRawSubject(String rawSubject) {
		this.rawSubject = rawSubject;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("priority")
	public Object getPriority() {
		return priority;
	}

	@JsonProperty("priority")
	public void setPriority(Object priority) {
		this.priority = priority;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("recipient")
	public Object getRecipient() {
		return recipient;
	}

	@JsonProperty("recipient")
	public void setRecipient(Object recipient) {
		this.recipient = recipient;
	}

	@JsonProperty("requester_id")
	public BigInteger getRequesterId() {
		return requesterId;
	}

	@JsonProperty("requester_id")
	public void setRequesterId(BigInteger requesterId) {
		this.requesterId = requesterId;
	}

	@JsonProperty("submitter_id")
	public BigInteger getSubmitterId() {
		return submitterId;
	}

	@JsonProperty("submitter_id")
	public void setSubmitterId(BigInteger submitterId) {
		this.submitterId = submitterId;
	}

	@JsonProperty("assignee_id")
	public BigInteger getAssigneeId() {
		return assigneeId;
	}

	@JsonProperty("assignee_id")
	public void setAssigneeId(BigInteger assigneeId) {
		this.assigneeId = assigneeId;
	}

	@JsonProperty("organization_id")
	public Object getOrganizationId() {
		return organizationId;
	}

	@JsonProperty("organization_id")
	public void setOrganizationId(Object organizationId) {
		this.organizationId = organizationId;
	}

	@JsonProperty("group_id")
	public BigInteger getGroupId() {
		return groupId;
	}

	@JsonProperty("group_id")
	public void setGroupId(BigInteger groupId) {
		this.groupId = groupId;
	}

	@JsonProperty("collaborator_ids")
	public List<Object> getCollaboratorIds() {
		return collaboratorIds;
	}

	@JsonProperty("collaborator_ids")
	public void setCollaboratorIds(List<Object> collaboratorIds) {
		this.collaboratorIds = collaboratorIds;
	}

	@JsonProperty("follower_ids")
	public List<Object> getFollowerIds() {
		return followerIds;
	}

	@JsonProperty("follower_ids")
	public void setFollowerIds(List<Object> followerIds) {
		this.followerIds = followerIds;
	}

	@JsonProperty("email_cc_ids")
	public List<Object> getEmailCcIds() {
		return emailCcIds;
	}

	@JsonProperty("email_cc_ids")
	public void setEmailCcIds(List<Object> emailCcIds) {
		this.emailCcIds = emailCcIds;
	}

	@JsonProperty("forum_topic_id")
	public Object getForumTopicId() {
		return forumTopicId;
	}

	@JsonProperty("forum_topic_id")
	public void setForumTopicId(Object forumTopicId) {
		this.forumTopicId = forumTopicId;
	}

	@JsonProperty("problem_id")
	public Object getProblemId() {
		return problemId;
	}

	@JsonProperty("problem_id")
	public void setProblemId(Object problemId) {
		this.problemId = problemId;
	}

	@JsonProperty("has_incidents")
	public Boolean getHasIncidents() {
		return hasIncidents;
	}

	@JsonProperty("has_incidents")
	public void setHasIncidents(Boolean hasIncidents) {
		this.hasIncidents = hasIncidents;
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

	@JsonProperty("tags")
	public List<String> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@JsonProperty("custom_fields")
	public List<Object> getCustomFields() {
		return customFields;
	}

	@JsonProperty("custom_fields")
	public void setCustomFields(List<Object> customFields) {
		this.customFields = customFields;
	}

	@JsonProperty("satisfaction_rating")
	public Object getSatisfactionRating() {
		return satisfactionRating;
	}

	@JsonProperty("satisfaction_rating")
	public void setSatisfactionRating(Object satisfactionRating) {
		this.satisfactionRating = satisfactionRating;
	}

	@JsonProperty("sharing_agreement_ids")
	public List<Object> getSharingAgreementIds() {
		return sharingAgreementIds;
	}

	@JsonProperty("sharing_agreement_ids")
	public void setSharingAgreementIds(List<Object> sharingAgreementIds) {
		this.sharingAgreementIds = sharingAgreementIds;
	}

	@JsonProperty("fields")
	public List<Object> getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(List<Object> fields) {
		this.fields = fields;
	}

	@JsonProperty("followup_ids")
	public List<Object> getFollowupIds() {
		return followupIds;
	}

	@JsonProperty("followup_ids")
	public void setFollowupIds(List<Object> followupIds) {
		this.followupIds = followupIds;
	}

	@JsonProperty("brand_id")
	public BigInteger getBrandId() {
		return brandId;
	}

	@JsonProperty("brand_id")
	public void setBrandId(BigInteger brandId) {
		this.brandId = brandId;
	}

	@JsonProperty("allow_channelback")
	public Boolean getAllowChannelback() {
		return allowChannelback;
	}

	@JsonProperty("allow_channelback")
	public void setAllowChannelback(Boolean allowChannelback) {
		this.allowChannelback = allowChannelback;
	}

	@JsonProperty("allow_attachments")
	public Boolean getAllowAttachments() {
		return allowAttachments;
	}

	@JsonProperty("allow_attachments")
	public void setAllowAttachments(Boolean allowAttachments) {
		this.allowAttachments = allowAttachments;
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
		return new ToStringBuilder(this).append("url", url).append("id", id).append("externalId", externalId).append("via", via).append("createdAt", createdAt).append("updatedAt", updatedAt).append("type", type).append("subject", subject).append("rawSubject", rawSubject).append("description", description).append("priority", priority).append("status", status).append("recipient", recipient).append("requesterId", requesterId).append("submitterId", submitterId).append("assigneeId", assigneeId).append("organizationId", organizationId).append("groupId", groupId).append("collaboratorIds", collaboratorIds).append("followerIds", followerIds).append("emailCcIds", emailCcIds).append("forumTopicId", forumTopicId).append("problemId", problemId).append("hasIncidents", hasIncidents).append("isPublic", isPublic).append("dueAt", dueAt).append("tags", tags).append("customFields", customFields).append("satisfactionRating", satisfactionRating).append("sharingAgreementIds", sharingAgreementIds).append("fields", fields).append("followupIds", followupIds).append("brandId", brandId).append("allowChannelback", allowChannelback).append("allowAttachments", allowAttachments).append("additionalProperties", additionalProperties).toString();
	}

}