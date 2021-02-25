package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{

	@Autowired
	private CompanyInterface ci;
	
	

	public Master(CompanyInterface ci) {
		super();
		this.ci = ci;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		ci.Start();
	}

	@Override
	public void callMySport() {
		// TODO Auto-generated method stub	
	}
	
}
