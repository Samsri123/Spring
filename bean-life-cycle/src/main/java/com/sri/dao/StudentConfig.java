package com.sri.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:JDBCConnection.properties")
@ComponentScan(basePackages="com.sri.dao")
public class StudentConfig {

}
