
package com.dukejiang.email_analytics.model.aggregate_model;

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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//    "results"
//})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregateAnalyticsResponse {
    @JsonProperty("results")
    private List<AggregateResult> results;
    @JsonIgnore
    private Map<String, Object> additionalProperties;


}

