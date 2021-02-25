package com.spring.noxml;

import org.springframework.stereotype.Component;

//@Component
public class Football implements SportInterface{

	@Override
	public void mySport() {
		// TODO Auto-generated method stub
		System.out.println("I am Football");
	}

}
