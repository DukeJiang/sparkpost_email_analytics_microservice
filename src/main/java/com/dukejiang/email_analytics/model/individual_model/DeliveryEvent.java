
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
    "ab_test_id",
    "ab_test_version",
    "amp_enabled",
    "campaign_id",
    "click_tracking",
    "customer_id",
    "delv_method",
    "device_token",
    "event_id",
    "friendly_from",
    "initial_pixel",
    "injection_time",
    "ip_address",
    "ip_pool",
    "mailbox_provider",
    "mailbox_provider_region",
    "message_id",
    "msg_from",
    "msg_size",
    "num_retries",
    "open_tracking",
    "outbound_tls",
    "queue_time",
    "rcpt_meta",
    "rcpt_tags",
    "rcpt_to",
    "rcpt_hash",
    "raw_rcpt_to",
    "rcpt_type",
    "recipient_domain",
    "recv_method",
    "routing_domain",
    "scheduled_time",
    "sending_domain",
    "sending_ip",
    "subaccount_id",
    "subject",
    "sms_coding",
    "sms_dst",
    "sms_dst_npi",
    "sms_dst_ton",
    "sms_remoteids",
    "sms_segments",
    "sms_src",
    "sms_src_npi",
    "sms_src_ton",
    "template_id",
    "template_version",
    "timestamp",
    "transactional",
    "transmission_id",
    "type"
})
@Generated("jsonschema2pojo")
public class DeliveryEvent {

    @JsonProperty("ab_test_id")
    private String abTestId;
    @JsonProperty("ab_test_version")
    private String abTestVersion;
    @JsonProperty("amp_enabled")
    private Boolean ampEnabled;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("click_tracking")
    private Boolean clickTracking;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("delv_method")
    private String delvMethod;
    @JsonProperty("device_token")
    private String deviceToken;
    @JsonProperty("event_id")
    private String eventId;
    @JsonProperty("friendly_from")
    private String friendlyFrom;
    @JsonProperty("initial_pixel")
    private Boolean initialPixel;
    @JsonProperty("injection_time")
    private String injectionTime;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("ip_pool")
    private String ipPool;
    @JsonProperty("mailbox_provider")
    private String mailboxProvider;
    @JsonProperty("mailbox_provider_region")
    private String mailboxProviderRegion;
    @JsonProperty("message_id")
    private String messageId;
    @JsonProperty("msg_from")
    private String msgFrom;
    @JsonProperty("msg_size")
    private String msgSize;
    @JsonProperty("num_retries")
    private String numRetries;
    @JsonProperty("open_tracking")
    private Boolean openTracking;
    @JsonProperty("outbound_tls")
    private String outboundTls;
    @JsonProperty("queue_time")
    private String queueTime;
    @JsonProperty("rcpt_meta")
    private RcptMeta rcptMeta;
    @JsonProperty("rcpt_tags")
    private List<String> rcptTags = null;
    @JsonProperty("rcpt_to")
    private String rcptTo;
    @JsonProperty("rcpt_hash")
    private String rcptHash;
    @JsonProperty("raw_rcpt_to")
    private String rawRcptTo;
    @JsonProperty("rcpt_type")
    private String rcptType;
    @JsonProperty("recipient_domain")
    private String recipientDomain;
    @JsonProperty("recv_method")
    private String recvMethod;
    @JsonProperty("routing_domain")
    private String routingDomain;
    @JsonProperty("scheduled_time")
    private String scheduledTime;
    @JsonProperty("sending_domain")
    private String sendingDomain;
    @JsonProperty("sending_ip")
    private String sendingIp;
    @JsonProperty("subaccount_id")
    private String subaccountId;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("sms_coding")
    private String smsCoding;
    @JsonProperty("sms_dst")
    private String smsDst;
    @JsonProperty("sms_dst_npi")
    private String smsDstNpi;
    @JsonProperty("sms_dst_ton")
    private String smsDstTon;
    @JsonProperty("sms_remoteids")
    private List<String> smsRemoteids = null;
    @JsonProperty("sms_segments")
    private Integer smsSegments;
    @JsonProperty("sms_src")
    private String smsSrc;
    @JsonProperty("sms_src_npi")
    private String smsSrcNpi;
    @JsonProperty("sms_src_ton")
    private String smsSrcTon;
    @JsonProperty("template_id")
    private String templateId;
    @JsonProperty("template_version")
    private String templateVersion;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("transactional")
    private String transactional;
    @JsonProperty("transmission_id")
    private String transmissionId;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ab_test_id")
    public String getAbTestId() {
        return abTestId;
    }

    @JsonProperty("ab_test_id")
    public void setAbTestId(String abTestId) {
        this.abTestId = abTestId;
    }

    @JsonProperty("ab_test_version")
    public String getAbTestVersion() {
        return abTestVersion;
    }

    @JsonProperty("ab_test_version")
    public void setAbTestVersion(String abTestVersion) {
        this.abTestVersion = abTestVersion;
    }

    @JsonProperty("amp_enabled")
    public Boolean getAmpEnabled() {
        return ampEnabled;
    }

    @JsonProperty("amp_enabled")
    public void setAmpEnabled(Boolean ampEnabled) {
        this.ampEnabled = ampEnabled;
    }

    @JsonProperty("campaign_id")
    public String getCampaignId() {
        return campaignId;
    }

    @JsonProperty("campaign_id")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    @JsonProperty("click_tracking")
    public Boolean getClickTracking() {
        return clickTracking;
    }

    @JsonProperty("click_tracking")
    public void setClickTracking(Boolean clickTracking) {
        this.clickTracking = clickTracking;
    }

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("delv_method")
    public String getDelvMethod() {
        return delvMethod;
    }

    @JsonProperty("delv_method")
    public void setDelvMethod(String delvMethod) {
        this.delvMethod = delvMethod;
    }

    @JsonProperty("device_token")
    public String getDeviceToken() {
        return deviceToken;
    }

    @JsonProperty("device_token")
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("event_id")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("friendly_from")
    public String getFriendlyFrom() {
        return friendlyFrom;
    }

    @JsonProperty("friendly_from")
    public void setFriendlyFrom(String friendlyFrom) {
        this.friendlyFrom = friendlyFrom;
    }

    @JsonProperty("initial_pixel")
    public Boolean getInitialPixel() {
        return initialPixel;
    }

    @JsonProperty("initial_pixel")
    public void setInitialPixel(Boolean initialPixel) {
        this.initialPixel = initialPixel;
    }

    @JsonProperty("injection_time")
    public String getInjectionTime() {
        return injectionTime;
    }

    @JsonProperty("injection_time")
    public void setInjectionTime(String injectionTime) {
        this.injectionTime = injectionTime;
    }

    @JsonProperty("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @JsonProperty("ip_pool")
    public String getIpPool() {
        return ipPool;
    }

    @JsonProperty("ip_pool")
    public void setIpPool(String ipPool) {
        this.ipPool = ipPool;
    }

    @JsonProperty("mailbox_provider")
    public String getMailboxProvider() {
        return mailboxProvider;
    }

    @JsonProperty("mailbox_provider")
    public void setMailboxProvider(String mailboxProvider) {
        this.mailboxProvider = mailboxProvider;
    }

    @JsonProperty("mailbox_provider_region")
    public String getMailboxProviderRegion() {
        return mailboxProviderRegion;
    }

    @JsonProperty("mailbox_provider_region")
    public void setMailboxProviderRegion(String mailboxProviderRegion) {
        this.mailboxProviderRegion = mailboxProviderRegion;
    }

    @JsonProperty("message_id")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("message_id")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("msg_from")
    public String getMsgFrom() {
        return msgFrom;
    }

    @JsonProperty("msg_from")
    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }

    @JsonProperty("msg_size")
    public String getMsgSize() {
        return msgSize;
    }

    @JsonProperty("msg_size")
    public void setMsgSize(String msgSize) {
        this.msgSize = msgSize;
    }

    @JsonProperty("num_retries")
    public String getNumRetries() {
        return numRetries;
    }

    @JsonProperty("num_retries")
    public void setNumRetries(String numRetries) {
        this.numRetries = numRetries;
    }

    @JsonProperty("open_tracking")
    public Boolean getOpenTracking() {
        return openTracking;
    }

    @JsonProperty("open_tracking")
    public void setOpenTracking(Boolean openTracking) {
        this.openTracking = openTracking;
    }

    @JsonProperty("outbound_tls")
    public String getOutboundTls() {
        return outboundTls;
    }

    @JsonProperty("outbound_tls")
    public void setOutboundTls(String outboundTls) {
        this.outboundTls = outboundTls;
    }

    @JsonProperty("queue_time")
    public String getQueueTime() {
        return queueTime;
    }

    @JsonProperty("queue_time")
    public void setQueueTime(String queueTime) {
        this.queueTime = queueTime;
    }

    @JsonProperty("rcpt_meta")
    public RcptMeta getRcptMeta() {
        return rcptMeta;
    }

    @JsonProperty("rcpt_meta")
    public void setRcptMeta(RcptMeta rcptMeta) {
        this.rcptMeta = rcptMeta;
    }

    @JsonProperty("rcpt_tags")
    public List<String> getRcptTags() {
        return rcptTags;
    }

    @JsonProperty("rcpt_tags")
    public void setRcptTags(List<String> rcptTags) {
        this.rcptTags = rcptTags;
    }

    @JsonProperty("rcpt_to")
    public String getRcptTo() {
        return rcptTo;
    }

    @JsonProperty("rcpt_to")
    public void setRcptTo(String rcptTo) {
        this.rcptTo = rcptTo;
    }

    @JsonProperty("rcpt_hash")
    public String getRcptHash() {
        return rcptHash;
    }

    @JsonProperty("rcpt_hash")
    public void setRcptHash(String rcptHash) {
        this.rcptHash = rcptHash;
    }

    @JsonProperty("raw_rcpt_to")
    public String getRawRcptTo() {
        return rawRcptTo;
    }

    @JsonProperty("raw_rcpt_to")
    public void setRawRcptTo(String rawRcptTo) {
        this.rawRcptTo = rawRcptTo;
    }

    @JsonProperty("rcpt_type")
    public String getRcptType() {
        return rcptType;
    }

    @JsonProperty("rcpt_type")
    public void setRcptType(String rcptType) {
        this.rcptType = rcptType;
    }

    @JsonProperty("recipient_domain")
    public String getRecipientDomain() {
        return recipientDomain;
    }

    @JsonProperty("recipient_domain")
    public void setRecipientDomain(String recipientDomain) {
        this.recipientDomain = recipientDomain;
    }

    @JsonProperty("recv_method")
    public String getRecvMethod() {
        return recvMethod;
    }

    @JsonProperty("recv_method")
    public void setRecvMethod(String recvMethod) {
        this.recvMethod = recvMethod;
    }

    @JsonProperty("routing_domain")
    public String getRoutingDomain() {
        return routingDomain;
    }

    @JsonProperty("routing_domain")
    public void setRoutingDomain(String routingDomain) {
        this.routingDomain = routingDomain;
    }

    @JsonProperty("scheduled_time")
    public String getScheduledTime() {
        return scheduledTime;
    }

    @JsonProperty("scheduled_time")
    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    @JsonProperty("sending_domain")
    public String getSendingDomain() {
        return sendingDomain;
    }

    @JsonProperty("sending_domain")
    public void setSendingDomain(String sendingDomain) {
        this.sendingDomain = sendingDomain;
    }

    @JsonProperty("sending_ip")
    public String getSendingIp() {
        return sendingIp;
    }

    @JsonProperty("sending_ip")
    public void setSendingIp(String sendingIp) {
        this.sendingIp = sendingIp;
    }

    @JsonProperty("subaccount_id")
    public String getSubaccountId() {
        return subaccountId;
    }

    @JsonProperty("subaccount_id")
    public void setSubaccountId(String subaccountId) {
        this.subaccountId = subaccountId;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("sms_coding")
    public String getSmsCoding() {
        return smsCoding;
    }

    @JsonProperty("sms_coding")
    public void setSmsCoding(String smsCoding) {
        this.smsCoding = smsCoding;
    }

    @JsonProperty("sms_dst")
    public String getSmsDst() {
        return smsDst;
    }

    @JsonProperty("sms_dst")
    public void setSmsDst(String smsDst) {
        this.smsDst = smsDst;
    }

    @JsonProperty("sms_dst_npi")
    public String getSmsDstNpi() {
        return smsDstNpi;
    }

    @JsonProperty("sms_dst_npi")
    public void setSmsDstNpi(String smsDstNpi) {
        this.smsDstNpi = smsDstNpi;
    }

    @JsonProperty("sms_dst_ton")
    public String getSmsDstTon() {
        return smsDstTon;
    }

    @JsonProperty("sms_dst_ton")
    public void setSmsDstTon(String smsDstTon) {
        this.smsDstTon = smsDstTon;
    }

    @JsonProperty("sms_remoteids")
    public List<String> getSmsRemoteids() {
        return smsRemoteids;
    }

    @JsonProperty("sms_remoteids")
    public void setSmsRemoteids(List<String> smsRemoteids) {
        this.smsRemoteids = smsRemoteids;
    }

    @JsonProperty("sms_segments")
    public Integer getSmsSegments() {
        return smsSegments;
    }

    @JsonProperty("sms_segments")
    public void setSmsSegments(Integer smsSegments) {
        this.smsSegments = smsSegments;
    }

    @JsonProperty("sms_src")
    public String getSmsSrc() {
        return smsSrc;
    }

    @JsonProperty("sms_src")
    public void setSmsSrc(String smsSrc) {
        this.smsSrc = smsSrc;
    }

    @JsonProperty("sms_src_npi")
    public String getSmsSrcNpi() {
        return smsSrcNpi;
    }

    @JsonProperty("sms_src_npi")
    public void setSmsSrcNpi(String smsSrcNpi) {
        this.smsSrcNpi = smsSrcNpi;
    }

    @JsonProperty("sms_src_ton")
    public String getSmsSrcTon() {
        return smsSrcTon;
    }

    @JsonProperty("sms_src_ton")
    public void setSmsSrcTon(String smsSrcTon) {
        this.smsSrcTon = smsSrcTon;
    }

    @JsonProperty("template_id")
    public String getTemplateId() {
        return templateId;
    }

    @JsonProperty("template_id")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @JsonProperty("template_version")
    public String getTemplateVersion() {
        return templateVersion;
    }

    @JsonProperty("template_version")
    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("transactional")
    public String getTransactional() {
        return transactional;
    }

    @JsonProperty("transactional")
    public void setTransactional(String transactional) {
        this.transactional = transactional;
    }

    @JsonProperty("transmission_id")
    public String getTransmissionId() {
        return transmissionId;
    }

    @JsonProperty("transmission_id")
    public void setTransmissionId(String transmissionId) {
        this.transmissionId = transmissionId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
