package com.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Admin implements PersonInterface{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am Admin");
	}

}
