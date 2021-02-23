package com.spring.ann;

import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am Master");
	}
}
