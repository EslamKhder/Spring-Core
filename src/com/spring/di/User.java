package com.spring.di;

public class User implements UserInterface {

	private PersonInterface person;
	
	
	@Override
	public void start() {
		System.out.println("I am User");
	}
	
	public void setPerson(PersonInterface person) {
		this.person = person;
	}
	@Override
	public void getPerson() {
		this.person.begain();
	}

}
/*

setPerson          person
 * */