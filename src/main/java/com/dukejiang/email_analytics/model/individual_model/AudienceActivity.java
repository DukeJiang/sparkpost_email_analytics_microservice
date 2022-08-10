package com.dukejiang.email_analytics.model.individual_model;

import com.dukejiang.email_analytics.model.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "audience_activity")
public class AudienceActivity extends BaseEntity {
    @Id
    private int id;
}
