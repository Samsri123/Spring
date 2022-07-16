package com.sri.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration		//To specify it is a config class and use it before the config class 
@ComponentScan(basePackages="com.sri.model") 	//To scan the bans inside the package
@PropertySource("classpath:CollegeInfo.properties")	//To mention where is the property file in oder to inject the dynamic literal_dependency values and 
public class CollegeConfig {						//used it before the config class
	/*
	 * @Bean public College collegeBean() { College college = new
	 * College(principalBean()); College college = new College();
	 * college.setPrincipal(principalBean()); college.setTeacher(mathTeacherBean());
	 * return college; }
	 * 
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public Teacher mathTeacherBean() { return new Mathteacher(); }
	 */
}
