package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private List<String> listOfFortunes = new ArrayList<String>();
	private Random myRandom = new Random();
	
	@PostConstruct
	public void doStartUpStuff() {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/Java/workspaces/springWorkspace/spring/spring-demo-annotations/src/fortunes.txt"));
			while ((line = br.readLine())!= null) {
				listOfFortunes.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(listOfFortunes.size());
		return listOfFortunes.get(index);
	}

}
