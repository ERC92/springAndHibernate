package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("badMint")
public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public BadmintonCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play 5 games of badminton";
	}
	
	@Override
	public String getDailyFortune() {
		return "Badminton: " + fortuneService.getFortune();
	}

}
