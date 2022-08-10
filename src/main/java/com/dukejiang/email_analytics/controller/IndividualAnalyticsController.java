package com.dukejiang.email_analytics.controller;

import com.dukejiang.email_analytics.model.individual_model.event_payload.Event;
import com.dukejiang.email_analytics.repository.AudienceActivityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j // logger
@RestController
@RequestMapping(path = "/analytics/individual")
public class IndividualAnalyticsController {

    @Autowired
    AudienceActivityRepository audienceActivityRepository;

    @Value("${TESTING_DOMAIN}")
    private String TESTING_DOMAIN;

    @Autowired
    WebClient webClient;

    /**
     * sends back the aggregated count of each event types in audience_activity table
     * @return aggregated count and total count (of transmission)
     */
    @RequestMapping(value={"/getIndividualAnalytics"}, method = GET)
    @ResponseBody
    public Mono<Collection<Event>> getIndividualAnalytics() {
        log.info("fetching individual analytics information...");
        String from = "2022-07-024T00:00"; //Temporary value
        String recipients = "yuxuanjiang@uchicago.edu"; //Temporary value
        Mono<Collection<Event>> response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/v1/events/message")
                        .queryParam("events", "delivery")
                        .queryParam("from", from)
                        .queryParam("recipients", recipients)
                        .queryParam("sending_domains", TESTING_DOMAIN)
                        .build())
                .retrieve()
                .bodyToFlux(Event.class)
                .collect(Collectors.toList());
        return response;
    }
}
