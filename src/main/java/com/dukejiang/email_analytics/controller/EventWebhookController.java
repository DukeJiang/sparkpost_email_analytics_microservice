package com.dukejiang.email_analytics.controller;

import com.dukejiang.email_analytics.repository.AudienceActivityRepository;
import com.dukejiang.email_analytics.repository.TransmissionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@RestController
@RequestMapping(path = "/analytics/webhook")
public class EventWebhookController {
    @Autowired
    AudienceActivityRepository audienceActivityRepository;

    @Autowired
    TransmissionRepository transmissionRepository;

    //respond to incoming webhook, uses transmission id to query transmission entity, get audience_id
    //and audience_email. Then insert into audience_activity table
    @RequestMapping(value = "/eventWebhook", method = POST)
    public ResponseEntity handleEventWebhook(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
