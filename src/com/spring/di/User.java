package com.spring.di;

public class User implements UserInterface {

	private PersonInterface person;
	private String email;
	private String team;
	
	
	@Override
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
	

	public void doStart() {
		System.out.println("Start");
	}
	
	public void doEnd() {
		System.out.println("End");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*

setPerson          person
 * */