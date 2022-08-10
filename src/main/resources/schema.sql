create database email_automation;

use email_automation;

CREATE TABLE IF NOT EXISTS `user`(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` VARCHAR(255) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `update_by` VARCHAR(255) DEFAULT NULL,
    `username` VARCHAR(255) NOT NULL,
    `password_hash` VARCHAR(255) NOT NULL,
    `avatar_url` VARCHAR(1024),
    `domain` VARCHAR(255) NOT NULL,
    `company_id` BIGINT DEFAULT NULL,
    `unsubscribe_link` VARCHAR(255) NOT NULL,
    `subscription_type` VARCHAR(255) NOT NULL,
    `unsubscribe_type` VARCHAR(255) NOT NULL,
    `contact_name` VARCHAR(255),
    `contact_email` VARCHAR(255),
    `contact_phone` VARCHAR(255),
    `address` VARCHAR(255),
    `api_key` BIGINT NOT NULL,
    `salesforce_api_key` VARCHAR(255),
    `shopify_api_key` VARCHAR(255),
    `hubspot_api_key` VARCHAR(255),
    `facebook_ads_api_key` VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS `campaign`(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` VARCHAR(255) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `update_by` VARCHAR(255) DEFAULT NULL,
    `name` VARCHAR(255) NOT NULL,
    `email_template_serialized` TEXT NOT NULL,
    `sender` VARCHAR(255) NOT NULL,
    `subject` VARCHAR(1024),
    `campaign_industry` VARCHAR(255),
    `reply_to` VARCHAR(255) NOT NULL,
    `run_times` INT NOT NULL,
    `send_times` INT NOT NULL,
    `list_id` BIGINT,
    `number_of_recipients` INT,
    `number_delivered` INT,
    `number_opened` INT,
    `percentage_opened` FLOAT(2),
    `number_clicked` INT,
    `percentage_clicked` FLOAT(2),
    `number_unsubscribed` INT,
    `percentage_unsubscribed` FLOAT(2),
    FOREIGN KEY (list_id) REFERENCES audience_list(id)
);

CREATE TABLE IF NOT EXISTS `objective`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `journey_template`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `journey_name` VARCHAR(255) NOT NULL,
  `thumbnail_url` VARCHAR(255) NOT NULL,
  `journey_template_serialized`TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS `journey`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `journey_name` VARCHAR(255) NOT NULL,
  `thumbnail_url` VARCHAR(255) NOT NULL,
  `journey_template_serialized` TEXT NOT NULL,
  `status` INT NOT NULL,
  `stage` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `analytics`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `number_of_recipients` INT,
  `number_delivered` INT,
  `number_opened` INT,
  `percentage_opened` FLOAT(2),
  `number_clicked` INT,
  `percentage_clicked` FLOAT(2),
  `number_unsubscribed` INT,
  `percentage_unsubscribed` FLOAT(2)
);

CREATE TABLE IF NOT EXISTS `node`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL,
  `type` VARCHAR(10) NOT NULL,
  `status` VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS `time_event`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `node_id` BIGINT NOT NULL,
  `journey_id` BIGINT NOT NULL,
  `user_id` BIGINT NOT NULL,
  `repeat` INT NOT NULL,
  `repeat_numbers` BIGINT NOT NULL,
  `trigger_time` TIMESTAMP NOT NULL,
  FOREIGN KEY (node_id) REFERENCES node(id),
  FOREIGN KEY (journey_id) REFERENCES journey(id),
  FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS `audience`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `email` VARCHAR(255) NOT NULL,
  `first_name` VARCHAR(255),
  `last_name` VARCHAR(255),
  `address` TEXT,
  `phone` VARCHAR(255),
  `birthday` TIMESTAMP,
  `source` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `tag`(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` VARCHAR(255) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `update_by` VARCHAR(255) DEFAULT NULL,
    `tag_name` VARCHAR(255) NOT NULL,
    `from_journey_id` BIGINT NOT NULL,
    FOREIGN KEY (from_journey_id) REFERENCES journey(id)
);

CREATE TABLE IF NOT EXISTS `payment`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `payment_method` VARCHAR(255) NOT NULL,
  `payment_date` TIMESTAMP NOT NULL,
  `card_number` VARCHAR(255) NOT NULL,
  `first_name` VARCHAR(255),
  `last_name` VARCHAR(255),
  `billing_info` TEXT
);

CREATE TABLE IF NOT EXISTS `team_member`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `username` VARCHAR(255) NOT NULL,
  `account_email` VARCHAR(255),
  `assigned_role` VARCHAR(255) NOT NULL,
  `joined_time` TIMESTAMP
);

CREATE TABLE IF NOT EXISTS `team`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `segment`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `audience_list`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `name` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `audience_activity`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `event_type` VARCHAR(255) NOT NULL,
  `audience_id` BIGINT NOT NULL,
  `audience_email` VARCHAR(255) NOT NULL,
  FOREIGN KEY (audience_id) REFERENCES audience(id)
);

CREATE TABLE IF NOT EXISTS `transmission`(
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `created_at` TIMESTAMP NOT NULL,
  `created_by` VARCHAR(255) NOT NULL,
  `updated_at` TIMESTAMP DEFAULT NULL,
  `update_by` VARCHAR(255) DEFAULT NULL,
  `audience_id` BIGINT NOT NULL,
  `audience_email` VARCHAR(255) NOT NULL,
  FOREIGN KEY (audience_id) REFERENCES audience(id)
);

CREATE TABLE IF NOT EXISTS `user_campaign`(
    `user_id` BIGINT NOT NULL,
    `campaign_id` BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (campaign_id) REFERENCES campaign(id),
    PRIMARY KEY (`user_id`, `campaign_id`)
);

CREATE TABLE IF NOT EXISTS `user_objective`(
    `user_id` BIGINT NOT NULL,
    `objective_id` BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (objective_id) REFERENCES objective(id),
    PRIMARY KEY (`user_id`, `objective_id`)
);

CREATE TABLE IF NOT EXISTS `campaign_analytics`(
  `analytics_id` BIGINT NOT NULL,
  `campaign_id` BIGINT NOT NULL,
  FOREIGN KEY (analytics_id) REFERENCES analytics(id),
  FOREIGN KEY (campaign_id) REFERENCES campaign(id),
  PRIMARY KEY (`analytics_id`, `campaign_id`)
);

CREATE TABLE IF NOT EXISTS `user_journey_template`(
  `user_id` BIGINT NOT NULL,
  `journey_template_id` BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (journey_template_id) REFERENCES journey_template(id),
  PRIMARY KEY (`user_id`, `journey_template_id`)
);

CREATE TABLE IF NOT EXISTS `user_journey`(
  `user_id` BIGINT NOT NULL,
  `journey_id` BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (journey_id) REFERENCES journey(id),
  PRIMARY KEY (`user_id`, `journey_id`)
);

CREATE TABLE IF NOT EXISTS `objective_journey`(
  `objective_id` BIGINT NOT NULL,
  `journey_id` BIGINT NOT NULL,
  FOREIGN KEY (objective_id) REFERENCES objective(id),
  FOREIGN KEY (journey_id) REFERENCES journey(id),
  PRIMARY KEY (`objective_id`, `journey_id`)
);

CREATE TABLE IF NOT EXISTS `journey_analytics`(
  `journey_id` BIGINT NOT NULL,
  `analytics_id` BIGINT NOT NULL,
  FOREIGN KEY (journey_id) REFERENCES journey(id),
  FOREIGN KEY (analytics_id) REFERENCES analytics(id),
  PRIMARY KEY (`journey_id`, `analytics_id`)
);

CREATE TABLE IF NOT EXISTS `user_audience`(
  `user_id` BIGINT NOT NULL,
  `audience_id` BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (audience_id) REFERENCES audience(id),
  PRIMARY KEY (`user_id`, `audience_id`)
);

CREATE TABLE IF NOT EXISTS `journey_node`(
  `journey_id` BIGINT NOT NULL,
  `node_id` BIGINT NOT NULL,
  FOREIGN KEY (journey_id) REFERENCES journey(id),
  FOREIGN KEY (node_id) REFERENCES node(id),
  PRIMARY KEY (`journey_id`, `node_id`)
);

CREATE TABLE IF NOT EXISTS `campaign_node`(
  `node_id` BIGINT NOT NULL,
  `campaign_id` BIGINT NOT NULL,
  FOREIGN KEY (node_id) REFERENCES node(id),
  FOREIGN KEY (campaign_id) REFERENCES campaign(id),
  PRIMARY KEY (`node_id`, `campaign_id`)
);

CREATE TABLE IF NOT EXISTS `node_audience`(
  `node_id` BIGINT NOT NULL,
  `audience_id` BIGINT NOT NULL,
  FOREIGN KEY (node_id) REFERENCES node(id),
  FOREIGN KEY (audience_id) REFERENCES audience(id),
  PRIMARY KEY (`node_id`, `audience_id`)
);

CREATE TABLE IF NOT EXISTS `audience_list_audience`(
  `audience_list_id` BIGINT NOT NULL,
  `audience_id` BIGINT NOT NULL,
  FOREIGN KEY (audience_list_id) REFERENCES audience_list(id),
  FOREIGN KEY (audience_id) REFERENCES audience(id),
  PRIMARY KEY (`audience_list_id`, `audience_id`)
);

CREATE TABLE IF NOT EXISTS `segment_audience`(
  `segment_id` BIGINT NOT NULL,
  `audience_id` BIGINT NOT NULL,
  FOREIGN KEY (segment_id) REFERENCES segment(id),
  FOREIGN KEY (audience_id) REFERENCES audience(id),
  PRIMARY KEY (`segment_id`, `audience_id`)
);

CREATE TABLE IF NOT EXISTS `user_payment`(
  `user_id` BIGINT NOT NULL,
  `payment_id` BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (payment_id) REFERENCES payment(id),
  PRIMARY KEY (`user_id`, `payment_id`)
);

CREATE TABLE IF NOT EXISTS `audience_tag`(
    `audience_id` BIGINT NOT NULL,
    `tag_id` BIGINT NOT NULL,
    FOREIGN KEY (audience_id) REFERENCES audience(id),
    FOREIGN KEY (tag_id) REFERENCES tag(id),
    PRIMARY KEY (`audience_id`, `tag_id`)
);

CREATE TABLE IF NOT EXISTS `user_team_member`(
    `user_id` BIGINT NOT NULL,
    `team_member_id` BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (team_member_id) REFERENCES team_member(id),
    PRIMARY KEY (`user_id`, `team_member_id`)
);

CREATE TABLE IF NOT EXISTS `team_member_team`(
    `team_member_id` BIGINT NOT NULL,
    `team_id` BIGINT NOT NULL,
    FOREIGN KEY (team_member_id) REFERENCES team_member(id),
    FOREIGN KEY (team_id) REFERENCES team(id),
    PRIMARY KEY (`team_member_id`, `team_id`)
);