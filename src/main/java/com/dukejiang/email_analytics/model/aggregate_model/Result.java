
package com.dukejiang.email_analytics.model.aggregate_model;

import java.util.HashMap;
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
    "count_sent",
    "count_accepted",
    "count_delivered",
    "count_nonprefetched_rendered",
    "count_clicked",
    "count_unique_clicked",
    "count_unsubscribe",
    "sending_domain"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("count_sent")
    private Integer countSent;
    @JsonProperty("count_accepted")
    private Integer countAccepted;
    @JsonProperty("count_delivered")
    private Integer countDelivered;
    @JsonProperty("count_nonprefetched_rendered")
    private Integer countNonprefetchedRendered;
    @JsonProperty("count_clicked")
    private Integer countClicked;
    @JsonProperty("count_unique_clicked")
    private Integer countUniqueClicked;
    @JsonProperty("count_unsubscribe")
    private Integer countUnsubscribe;
    @JsonProperty("sending_domain")
    private String sendingDomain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("count_sent")
    public Integer getCountSent() {
        return countSent;
    }

    @JsonProperty("count_sent")
    public void setCountSent(Integer countSent) {
        this.countSent = countSent;
    }

    @JsonProperty("count_accepted")
    public Integer getCountAccepted() {
        return countAccepted;
    }

    @JsonProperty("count_accepted")
    public void setCountAccepted(Integer countAccepted) {
        this.countAccepted = countAccepted;
    }

    @JsonProperty("count_delivered")
    public Integer getCountDelivered() {
        return countDelivered;
    }

    @JsonProperty("count_delivered")
    public void setCountDelivered(Integer countDelivered) {
        this.countDelivered = countDelivered;
    }

    @JsonProperty("count_nonprefetched_rendered")
    public Integer getCountNonprefetchedRendered() {
        return countNonprefetchedRendered;
    }

    @JsonProperty("count_nonprefetched_rendered")
    public void setCountNonprefetchedRendered(Integer countNonprefetchedRendered) {
        this.countNonprefetchedRendered = countNonprefetchedRendered;
    }

    @JsonProperty("count_clicked")
    public Integer getCountClicked() {
        return countClicked;
    }

    @JsonProperty("count_clicked")
    public void setCountClicked(Integer countClicked) {
        this.countClicked = countClicked;
    }

    @JsonProperty("count_unique_clicked")
    public Integer getCountUniqueClicked() {
        return countUniqueClicked;
    }

    @JsonProperty("count_unique_clicked")
    public void setCountUniqueClicked(Integer countUniqueClicked) {
        this.countUniqueClicked = countUniqueClicked;
    }

    @JsonProperty("count_unsubscribe")
    public Integer getCountUnsubscribe() {
        return countUnsubscribe;
    }

    @JsonProperty("count_unsubscribe")
    public void setCountUnsubscribe(Integer countUnsubscribe) {
        this.countUnsubscribe = countUnsubscribe;
    }

    @JsonProperty("sending_domain")
    public String getSendingDomain() {
        return sendingDomain;
    }

    @JsonProperty("sending_domain")
    public void setSendingDomain(String sendingDomain) {
        this.sendingDomain = sendingDomain;
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
