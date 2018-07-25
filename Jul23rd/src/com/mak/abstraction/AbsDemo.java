package com.mak.abstraction;

abstract class Person{
	String name;
	String DOB;
	public void doesBreath() {
		System.out.println("Every Person Breaths");
	}
	abstract public void doesDrive();
}

class Employee extends Person{
	String occupation;
	public Employee(String occupation){
		this.occupation = occupation;
	}
	
	@Override
	public void doesDrive() {
		if(occupation.equalsIgnoreCase("Driver"))
			System.out.println("He/She can Drive");
		else
			System.out.println("He/She can't Drive");
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Employee e = new Employee("driver");
		e.doesBreath();
		e.doesDrive();
	}
}
