package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach badCoach = context.getBean("badMint", Coach.class);
		Coach hockCoach = context.getBean("hockeyCoach", Coach.class);
		Coach tt = context.getBean("tableTennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("##########");
		System.out.println(badCoach.getDailyWorkout());
		System.out.println(badCoach.getDailyFortune());
		System.out.println("##########");
		System.out.println(hockCoach.getDailyWorkout());
		System.out.println(hockCoach.getDailyFortune());
		System.out.println("##########");
		System.out.println(tt.getDailyWorkout());
		System.out.println(tt.getDailyFortune());
		
		context.close();
	}

}
