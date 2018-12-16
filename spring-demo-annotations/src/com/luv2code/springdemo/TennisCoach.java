package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

@Component ("sillyCoach")
public class TennisCoach implements Coach, FortuneService {
	@Autowired
	@Qualifier ("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("<<TennisCoach>> Inside default constructor...");
	}
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService=fortuneService;
//		System.out.println("<<TennisCoach>> Inside setFortuneService....");
//	}
	
	public String getFortune() {
		return "asd";
	}
	
		
	public String getDailyWorkout() {
		
		return "Tenisaki kathe mera";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
