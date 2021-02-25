package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.spring.di.UserInterface;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfige.class);
		
		MasterInterface ms  = context.getBean("master",MasterInterface.class);
		
		ms.name();
		ms.getSport();
		
		context.close();
	}

}
