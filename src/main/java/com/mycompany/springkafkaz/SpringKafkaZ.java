/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springkafkaz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author zdraz
 */
@Service
public class SpringKafkaZ {

  private static final Logger logger = LogManager.getLogger(SpringKafkaZ.class);
    
  int iCycles = 0;
    
   @Scheduled(fixedRate=1000)
    public void sched()  {
            logger.info("Running " + iCycles++);
    }
    
}
