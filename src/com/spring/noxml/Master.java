package com.spring.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Master implements MasterInterface{

	//@Autowired
	//@Qualifier("sport")
	private SportInterface sp;
	
	
	public Master(SportInterface sp) {
		this.sp = sp;
	}


	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am Master");
	}


	@Override
	public void getSport() {
		// TODO Auto-generated method stub
		sp.mySport();
	}
	
}
