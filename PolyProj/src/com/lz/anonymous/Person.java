package com.lz.anonymous;

public abstract class Person {
	private String name;
	
	public Person () {
		
	}
	
	public Person(String name) {
		this.setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void read();
	
}
