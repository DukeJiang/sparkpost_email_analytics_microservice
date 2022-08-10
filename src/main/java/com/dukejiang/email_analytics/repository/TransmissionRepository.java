package com.dukejiang.email_analytics.repository;

import com.dukejiang.email_analytics.model.Transmission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionRepository extends CrudRepository<Transmission, Integer> {

}
