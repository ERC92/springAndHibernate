package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo") 
public class SportConfigComponentScan {
	//configuration class
	//can be used instead of having an XML configuration file with AnnotationConfigApplicationContext

}
