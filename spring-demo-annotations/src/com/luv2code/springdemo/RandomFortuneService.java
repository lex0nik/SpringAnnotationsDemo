package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String data[] = {"randomFortune1", "randomFortune2", "randomFortune3"};
	private Random myrandom = new Random();
	
	
	@Override
	public String getFortune() {
		int i = myrandom.nextInt(data.length);
		return data[i];
	}

}
