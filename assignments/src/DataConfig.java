package com.springAssignments;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.assignment6")
@PropertySource("classpath:config.properties")
public class DataConfig {

}
