/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springkafkaz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author zdraz
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class ApiConfig {
    
    @Bean
    public Docket swaggerApi() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.mycompany.springkafkaz"))
          // .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())                          
          .build();                                           
    }
    
    @Bean
    public InternalResourceViewResolver defaultViewResolver(){
        return new InternalResourceViewResolver();
    }
    
}
