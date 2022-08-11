package com.dukejiang.email_analytics.repository;

import com.dukejiang.email_analytics.model.AudienceActivity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface AudienceActivityRepository extends CrudRepository<AudienceActivity, Integer> {
    int countAllByEventTypeAndByCreateAtBetween(String eventType, Timestamp from, Timestamp to);

    int countAllByDomainAndEventTypeAndByCreateArBetween(String domain,
                                                         String eventType,
                                                         Timestamp from,
                                                         Timestamp to);

}
