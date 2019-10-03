package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Ok " + team + " - Practice serves and slams. Any questions email " + email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
