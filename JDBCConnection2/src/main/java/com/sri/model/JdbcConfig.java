package com.sri.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.sri.model")
@PropertySource("classpath:JdbcConnection.properties")
public class JdbcConfig {

}
