package com.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{

	private CompanyInterface ci;
	
	@Autowired
	public Master(CompanyInterface ci) {
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
