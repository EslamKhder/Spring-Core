package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Sport football = context.getBean("mySport",Sport.class);
		// call methods on the bean
		football.start();
		// close the context
		context.close();
		
		
		
		Sport foSport = new Basketball();
		foSport.start();
		/*Football football = new Football();
		football.start();
		Basketball basketball = new Basketball();
		basketball.start();*/
	}

}
