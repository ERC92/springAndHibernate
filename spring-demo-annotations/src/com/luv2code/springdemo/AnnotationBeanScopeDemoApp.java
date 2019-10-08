package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
		
		Coach theCoach = context.getBean("tableTennisCoach", Coach.class);		
		Coach alphaCoach = context.getBean("tableTennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object: " + result);		
		System.out.println("Memory location for theCoach: " + theCoach);		
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		Coach betaCoach = context.getBean("tennisCoach", Coach.class);		
		Coach gammaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result_diff = (betaCoach == gammaCoach);
		
		System.out.println("Pointing to the same object: " + result_diff);		
		System.out.println("Memory location for betaCoach: " + betaCoach);		
		System.out.println("Memory location for gammaCoach: " + gammaCoach);
		
		context.close();
	}

}
