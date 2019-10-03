package com.luv2code.springdemo;

import java.util.Random;

public class ArrayOfFortunesService implements FortuneService {
	
	private String[] fortunes = {"86% chance of meeting a dragon today","When I'm cleaning windows","We're blood brothers"};
	private Random r = new Random();
	int randomNumber;

	@Override
	public String getFortune() {
		randomNumber = r.nextInt(fortunes.length);
		return fortunes[randomNumber];
	}

}
