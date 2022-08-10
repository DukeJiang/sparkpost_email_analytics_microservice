package com.dukejiang.email_analytics.model.individual_model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualAnalyticsResponse {
    @JsonProperty("count_sent")
    private int countSent;
    @JsonProperty("count_delivered")
    private int countDelivered;
    @JsonProperty("count_clicked")
    private int countClicked;
    @JsonProperty("count_opened")
    private int countOpened;
    @JsonProperty("count_unsubscribe")
    private int countUnsubscribe;

}
