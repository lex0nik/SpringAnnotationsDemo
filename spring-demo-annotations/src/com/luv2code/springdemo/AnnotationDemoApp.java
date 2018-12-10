package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("sillyCoach", Coach.class);
		SwimCoach theCoach2 = (SwimCoach) context.getBean("swimCoach", Coach.class);
		Coach theCoach3 = context.getBean("sillyCoach", Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach2.getTeam());
		System.out.println(theCoach2.getEmail());
		System.out.println(theCoach3.getDailyFortune());
		System.out.println(theCoach3.getDailyFortune());
		context.close();
		

	}

}

