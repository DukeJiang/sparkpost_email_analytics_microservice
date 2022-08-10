package com.dukejiang.email_analytics.repository;

import com.dukejiang.email_analytics.model.Audience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudienceRepository extends JpaRepository<Audience, Integer> {
}
