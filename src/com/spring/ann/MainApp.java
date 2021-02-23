package com.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.UserInterface;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		MasterInterface ms = context.getBean("master",MasterInterface.class);
		
		ms.name();
		
		context.close();
		
		// retrieve bean from spring container
		//UserInterface user2 = context.getBean("user",UserInterface.class);
	}

}
