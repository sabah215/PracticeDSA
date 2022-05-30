package com.abstractclass;

public class Son extends Parent{

	public Son(int age) {
		this.age = age;
	}
	
	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("Doctor");		
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("Pepper Potts");	
	}
	
	int getAge() {
		return this.age;
	}

}
