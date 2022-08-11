package com.dukejiang.email_analytics.model;

import com.dukejiang.email_analytics.model.Audience;
import com.dukejiang.email_analytics.model.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "audience_activity")
public class AudienceActivity extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "id")
    private int id;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "audience_email")
    private String audience_email;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "audience_id", referencedColumnName = "id", nullable = false)
    private Audience audience;
}
