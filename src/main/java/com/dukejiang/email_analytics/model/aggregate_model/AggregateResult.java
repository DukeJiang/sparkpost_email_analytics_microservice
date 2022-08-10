
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//    "count_sent",
//    "count_accepted",
//    "count_delivered",
//    "count_nonprefetched_rendered",
//    "count_clicked",
//    "count_unique_clicked",
//    "count_unsubscribe",
//    "sending_domain"
//})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregateResult {
    @JsonProperty("count_sent")
    private Integer countSent;
    @JsonProperty("count_accepted")
    private Integer countAccepted;
    @JsonProperty("count_delivered")
    private Integer countDelivered;
    @JsonProperty("count_clicked")
    private Integer countClicked;
    @JsonProperty("count_unique_clicked")
    private Integer countUniqueClicked;
    @JsonProperty("count_unsubscribe")
    private Integer countUnsubscribe;
    @JsonProperty("sending_domain")
    private String sendingDomain;

}
