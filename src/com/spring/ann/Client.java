package com.spring.ann;

import org.springframework.stereotype.Component;

@Component
public class Client implements CompanyInterface{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("I am Client");
	}

}
