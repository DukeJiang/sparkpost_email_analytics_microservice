package com.dukejiang.email_analytics.controller;

import com.dukejiang.email_analytics.model.aggregate_model.AggregateAnalyticsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j // logger
@RestController
public class IndividualAnalyticsController {
    @Value("${TESTING_DOMAIN}")
    private String TESTING_DOMAIN;

    @Autowired
    WebClient webClient;

    @RequestMapping(value={"/getIndividualAnalytics"}, method = GET)
    @ResponseBody
    public AggregateAnalyticsResponse getIndividualAnalytics() {
        log.info("fetching aggregate analytics information...");
        String from = "2022-07-01T00:00";
        Mono<AggregateAnalyticsResponse> response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/v1/metrics/deliverability/sending-domain")
                        .queryParam("from", from)
                        .queryParam("sending_domain", TESTING_DOMAIN)
                        .queryParam("metrics", "count_sent,count_accepted,count_delivered,count_" +
                                "nonprefetched_rendered,count_clicked,count_unique_clicked,count_unsubscribe")
                        .build())
                .retrieve()
                .bodyToMono(AggregateAnalyticsResponse.class);
        return response.block();
    }
}
