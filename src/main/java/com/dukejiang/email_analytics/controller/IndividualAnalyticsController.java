package com.dukejiang.email_analytics.controller;

import com.dukejiang.email_analytics.model.Audience;
import com.dukejiang.email_analytics.model.individual_model.IndividualAnalyticsResponse;
import com.dukejiang.email_analytics.repository.AudienceActivityRepository;
import com.dukejiang.email_analytics.repository.AudienceRepository;
import com.dukejiang.email_analytics.repository.TransmissionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j // logger
@RestController
@RequestMapping(path = "/analytics/individual")
public class IndividualAnalyticsController {
    enum EventType{
        delivery,
        click,
        open,
        list_unsubscribe,
        link_unsubscribe,
    }

    @Autowired
    AudienceActivityRepository audienceActivityRepository;

    @Autowired
    AudienceRepository audienceRepository;

    @Autowired
    TransmissionRepository transmissionRepository;

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
    public Mono<IndividualAnalyticsResponse> getIndividualAnalytics(@RequestParam(name = "audience_id") int audienceId) {
        log.info("fetching individual analytics information...");
        //find target audience
        Optional<Audience> audience = audienceRepository.findById(audienceId);
        assert audience.isPresent();
        //get total transmission count
        int totalTransmissionCnt = transmissionRepository.countAllByAudience(audience.get());
        //get each event type count
        int deliveryCnt = audienceActivityRepository.countAllByEventType(EventType.delivery.toString());
        int clickCnt = audienceActivityRepository.countAllByEventType(EventType.click.toString());
        int openCnt = audienceActivityRepository.countAllByEventType(EventType.open.toString());
        int unsubscribeCnt = audienceActivityRepository.countAllByEventType(EventType.list_unsubscribe.toString()) +
                                audienceActivityRepository.countAllByEventType(EventType.link_unsubscribe.toString());
        IndividualAnalyticsResponse response = new IndividualAnalyticsResponse();
        response.setCountSent(totalTransmissionCnt);
        response.setCountClicked(clickCnt);
        response.setCountDelivered(deliveryCnt);
        response.setCountOpened(openCnt);
        response.setCountUnsubscribe(unsubscribeCnt);

        return Mono.just(response);
    }
}
