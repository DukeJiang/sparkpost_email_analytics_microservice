package com.dukejiang.email_analytics.repository;

import com.dukejiang.email_analytics.model.individual_model.AudienceActivity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudienceActivityRepository extends CrudRepository<AudienceActivity, Integer> {
}
