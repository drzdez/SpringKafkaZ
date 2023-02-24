/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zdrazil.springkafkaz;

import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

/**
 *
 * @author zdraz
 */
@Configuration
public class SpringKafkaZConfig {
    
  private static final Logger logger = LogManager.getLogger(SpringKafkaZConfig.class);
    
    @Value(value = "${com.springkafkaz.topic}") 
    private String kafkaTopicz;
    
    public String getKafkaTopicz() {
        return this.kafkaTopicz;
    }
    
}
