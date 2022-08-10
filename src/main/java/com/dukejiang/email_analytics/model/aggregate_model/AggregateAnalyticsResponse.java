package com.dukejiang.email_analytics.model.aggregate_model;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

