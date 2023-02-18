/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springkafkaz;

import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
  
  @Bean
  ProducerFactory<String, String> myKafkaProducerTemplate(){
      return new DefaultKafkaProducerFactory<>(Map.of("topic", "blabla"));
  /*      
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
  */
  }
  
  @Bean
  KafkaTemplate<String, String> myKafkaTemplate(){
      return new KafkaTemplate<>(myKafkaProducerTemplate()) ;
  }
    
}
