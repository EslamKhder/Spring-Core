package com.spring.ann;

import org.springframework.stereotype.Component;

import com.spring.ioc.Sport;

@Component
public class TennisSport implements SportInterface{

	@Override
	public void mySport() {
		System.out.println("I am Tennis");
	}
	
}