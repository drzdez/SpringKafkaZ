/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zdrazil.springkafkaz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author zdraz
 */
@Service
@EnableKafka
public class SpringKafkaZ {

  private static final Logger logger = LogManager.getLogger(SpringKafkaZ.class);
    
  int iCycles = 0;
  KafkaTemplate<String, String> kafkaTemplate;
  SpringKafkaZConfig kafkaConfig;
  
  @Autowired
  public SpringKafkaZ(KafkaTemplate<String, String> kafkaTemplate,
          SpringKafkaZConfig kafkaConfig){
      this.kafkaTemplate = kafkaTemplate;
      this.kafkaConfig = kafkaConfig;
  }
    
   @Scheduled(fixedRate=1000)
    public void sched()  {
            logger.info("Running " + iCycles++);
            kafkaTemplate.send(kafkaConfig.getKafkaTopicz(), Integer.toString(iCycles), String.format("test%3d", iCycles));
    }
  
}
