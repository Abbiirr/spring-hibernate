package com.example.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);



		// use the object
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// read spring config file
		ClassPathXmlApplicationContext context1 =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach1 = context.getBean("myCricketCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach1.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach1.getDailyFortune());

		System.out.println(theCoach1.getTeam());

		System.out.println(theCoach1.getEmailAddress());

		// close the context
		context1.close();
	}

}
