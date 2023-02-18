/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.springkafkaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *com.mycompany.springkafkaz.SpringKafkaZApp
 * @author zdraz
 */
@SpringBootApplication
@EnableScheduling 
@EnableKafka
@EnableWebMvc
@EnableSwagger2
public class SpringKafkaZApp {

    public static void main(String[] args) {
        //ConfigurableApplicationContext ctx = 
        SpringApplication.run(SpringKafkaZApp.class, args);
        //ctx.start();
    }
}
