package com.dukejiang.email_analytics.controller;

import com.dukejiang.email_analytics.model.individual_model.DeliveryEvent;
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
    public Mono<DeliveryEvent> getIndividualAnalytics() {
        log.info("fetching individual analytics information...");
        String from = "2022-07-024T00:00"; //Temporary value
        String recipients = "yuxuanjiang@uchicago.edu"; //Temporary value
        Mono<DeliveryEvent> response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/v1/events/message")
                        .queryParam("events", "delivery")
                        .queryParam("from", from)
                        .queryParam("recipients", recipients)
                        .queryParam("sending_domains", TESTING_DOMAIN)
                        .build())
                .retrieve()
                .bodyToMono(DeliveryEvent.class);
        return response;
    }
}
