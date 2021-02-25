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
		
		Manger ms  = context.getBean("manger",Manger.class);
		
		System.out.println(ms.getEmail());
		System.out.println(ms.getTeam());
		
		context.close();
	}

}
