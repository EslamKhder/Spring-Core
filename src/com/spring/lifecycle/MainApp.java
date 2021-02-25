package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		
		PersonInterface admin1 = context.getBean("admin",PersonInterface.class);
		
		// retrieve bean from spring container
		
		PersonInterface admin2 = context.getBean("admin",PersonInterface.class);
		// call methods on the bean
		
		System.out.println(admin1);
		
		System.out.println(admin2);
		
		System.out.println(admin1 == admin2);
		// close the context
		context.close();
	}

}
