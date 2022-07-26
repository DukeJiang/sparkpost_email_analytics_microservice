
package com.dukejiang.email_analytics.model.individual_model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mailbox_provider",
    "template_version",
    "friendly_from",
    "subject",
    "ip_pool",
    "sending_domain",
    "rcpt_tags",
    "type",
    "num_retries",
    "mailbox_provider_region",
    "raw_rcpt_to",
    "msg_from",
    "recv_method",
    "rcpt_to",
    "transmission_id",
    "campaign_id",
    "timestamp",
    "click_tracking",
    "outbound_tls",
    "message_id",
    "ip_address",
    "initial_pixel",
    "queue_time",
    "recipient_domain",
    "event_id",
    "routing_domain",
    "sending_ip",
    "template_id",
    "delv_method",
    "customer_id",
    "open_tracking",
    "injection_time",
    "msg_size"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("mailbox_provider")
    private String mailboxProvider;
    @JsonProperty("template_version")
    private String templateVersion;
    @JsonProperty("friendly_from")
    private String friendlyFrom;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("ip_pool")
    private String ipPool;
    @JsonProperty("sending_domain")
    private String sendingDomain;
    @JsonProperty("rcpt_tags")
    private List<Object> rcptTags = null;
    @JsonProperty("type")
    private String type;
    @JsonProperty("num_retries")
    private String numRetries;
    @JsonProperty("mailbox_provider_region")
    private String mailboxProviderRegion;
    @JsonProperty("raw_rcpt_to")
    private String rawRcptTo;
    @JsonProperty("msg_from")
    private String msgFrom;
    @JsonProperty("recv_method")
    private String recvMethod;
    @JsonProperty("rcpt_to")
    private String rcptTo;
    @JsonProperty("transmission_id")
    private String transmissionId;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("click_tracking")
    private Boolean clickTracking;
    @JsonProperty("outbound_tls")
    private String outboundTls;
    @JsonProperty("message_id")
    private String messageId;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("initial_pixel")
    private Boolean initialPixel;
    @JsonProperty("queue_time")
    private String queueTime;
    @JsonProperty("recipient_domain")
    private String recipientDomain;
    @JsonProperty("event_id")
    private String eventId;
    @JsonProperty("routing_domain")
    private String routingDomain;
    @JsonProperty("sending_ip")
    private String sendingIp;
    @JsonProperty("template_id")
    private String templateId;
    @JsonProperty("delv_method")
    private String delvMethod;
    @JsonProperty("customer_id")
    private Integer customerId;
    @JsonProperty("open_tracking")
    private Boolean openTracking;
    @JsonProperty("injection_time")
    private String injectionTime;
    @JsonProperty("msg_size")
    private String msgSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mailbox_provider")
    public String getMailboxProvider() {
        return mailboxProvider;
    }

    @JsonProperty("mailbox_provider")
    public void setMailboxProvider(String mailboxProvider) {
        this.mailboxProvider = mailboxProvider;
    }

    @JsonProperty("template_version")
    public String getTemplateVersion() {
        return templateVersion;
    }

    @JsonProperty("template_version")
    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    @JsonProperty("friendly_from")
    public String getFriendlyFrom() {
        return friendlyFrom;
    }

    @JsonProperty("friendly_from")
    public void setFriendlyFrom(String friendlyFrom) {
        this.friendlyFrom = friendlyFrom;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("ip_pool")
    public String getIpPool() {
        return ipPool;
    }

    @JsonProperty("ip_pool")
    public void setIpPool(String ipPool) {
        this.ipPool = ipPool;
    }

    @JsonProperty("sending_domain")
    public String getSendingDomain() {
        return sendingDomain;
    }

    @JsonProperty("sending_domain")
    public void setSendingDomain(String sendingDomain) {
        this.sendingDomain = sendingDomain;
    }

    @JsonProperty("rcpt_tags")
    public List<Object> getRcptTags() {
        return rcptTags;
    }

    @JsonProperty("rcpt_tags")
    public void setRcptTags(List<Object> rcptTags) {
        this.rcptTags = rcptTags;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("num_retries")
    public String getNumRetries() {
        return numRetries;
    }

    @JsonProperty("num_retries")
    public void setNumRetries(String numRetries) {
        this.numRetries = numRetries;
    }

    @JsonProperty("mailbox_provider_region")
    public String getMailboxProviderRegion() {
        return mailboxProviderRegion;
    }

    @JsonProperty("mailbox_provider_region")
    public void setMailboxProviderRegion(String mailboxProviderRegion) {
        this.mailboxProviderRegion = mailboxProviderRegion;
    }

    @JsonProperty("raw_rcpt_to")
    public String getRawRcptTo() {
        return rawRcptTo;
    }

    @JsonProperty("raw_rcpt_to")
    public void setRawRcptTo(String rawRcptTo) {
        this.rawRcptTo = rawRcptTo;
    }

    @JsonProperty("msg_from")
    public String getMsgFrom() {
        return msgFrom;
    }

    @JsonProperty("msg_from")
    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }

    @JsonProperty("recv_method")
    public String getRecvMethod() {
        return recvMethod;
    }

    @JsonProperty("recv_method")
    public void setRecvMethod(String recvMethod) {
        this.recvMethod = recvMethod;
    }

    @JsonProperty("rcpt_to")
    public String getRcptTo() {
        return rcptTo;
    }

    @JsonProperty("rcpt_to")
    public void setRcptTo(String rcptTo) {
        this.rcptTo = rcptTo;
    }

    @JsonProperty("transmission_id")
    public String getTransmissionId() {
        return transmissionId;
    }

    @JsonProperty("transmission_id")
    public void setTransmissionId(String transmissionId) {
        this.transmissionId = transmissionId;
    }

    @JsonProperty("campaign_id")
    public String getCampaignId() {
        return campaignId;
    }

    @JsonProperty("campaign_id")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("click_tracking")
    public Boolean getClickTracking() {
        return clickTracking;
    }

    @JsonProperty("click_tracking")
    public void setClickTracking(Boolean clickTracking) {
        this.clickTracking = clickTracking;
    }

    @JsonProperty("outbound_tls")
    public String getOutboundTls() {
        return outboundTls;
    }

    @JsonProperty("outbound_tls")
    public void setOutboundTls(String outboundTls) {
        this.outboundTls = outboundTls;
    }

    @JsonProperty("message_id")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("message_id")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @JsonProperty("initial_pixel")
    public Boolean getInitialPixel() {
        return initialPixel;
    }

    @JsonProperty("initial_pixel")
    public void setInitialPixel(Boolean initialPixel) {
        this.initialPixel = initialPixel;
    }

    @JsonProperty("queue_time")
    public String getQueueTime() {
        return queueTime;
    }

    @JsonProperty("queue_time")
    public void setQueueTime(String queueTime) {
        this.queueTime = queueTime;
    }

    @JsonProperty("recipient_domain")
    public String getRecipientDomain() {
        return recipientDomain;
    }

    @JsonProperty("recipient_domain")
    public void setRecipientDomain(String recipientDomain) {
        this.recipientDomain = recipientDomain;
    }

    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("event_id")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("routing_domain")
    public String getRoutingDomain() {
        return routingDomain;
    }

    @JsonProperty("routing_domain")
    public void setRoutingDomain(String routingDomain) {
        this.routingDomain = routingDomain;
    }

    @JsonProperty("sending_ip")
    public String getSendingIp() {
        return sendingIp;
    }

    @JsonProperty("sending_ip")
    public void setSendingIp(String sendingIp) {
        this.sendingIp = sendingIp;
    }

    @JsonProperty("template_id")
    public String getTemplateId() {
        return templateId;
    }

    @JsonProperty("template_id")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @JsonProperty("delv_method")
    public String getDelvMethod() {
        return delvMethod;
    }

    @JsonProperty("delv_method")
    public void setDelvMethod(String delvMethod) {
        this.delvMethod = delvMethod;
    }

    @JsonProperty("customer_id")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("open_tracking")
    public Boolean getOpenTracking() {
        return openTracking;
    }

    @JsonProperty("open_tracking")
    public void setOpenTracking(Boolean openTracking) {
        this.openTracking = openTracking;
    }

    @JsonProperty("injection_time")
    public String getInjectionTime() {
        return injectionTime;
    }

    @JsonProperty("injection_time")
    public void setInjectionTime(String injectionTime) {
        this.injectionTime = injectionTime;
    }

    @JsonProperty("msg_size")
    public String getMsgSize() {
        return msgSize;
    }

    @JsonProperty("msg_size")
    public void setMsgSize(String msgSize) {
        this.msgSize = msgSize;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
