package com.abstractclass;

public abstract class Parent {
	
	int age;
	
	public Parent() {
		
	}
	
	abstract void career();
	abstract void partner();
	
	int getAge() {
		return this.age;
	}
	
	static void hello() {
		System.out.println("Hello");	
	}
	
	 void normal() {
		System.out.println("Normal method");	
	}

}
