package com.mak.abstraction;

abstract class Person1 {
	abstract void whatDoYouDo();

	boolean doYouSpeak() {
		return true;
	}
}

class Trainer extends Person1 {
	@Override
	void whatDoYouDo() {
		System.out.println("I Train Employees");
	}
}

class Doctor extends Person1 {
	@Override
	void whatDoYouDo() {
		System.out.println("I cure Diseases");
	}
}

class Pilot extends Person1 {
	@Override
	void whatDoYouDo() {
		System.out.println("I can fly planes");
	}
}

public class TestAbstract1 {
	public static void main(String[] args) {
		Person1 t,d,p;
		t = new Trainer();
		d = new Doctor();
		p = new Pilot();	

		System.out.println(t.doYouSpeak());
		System.out.println(d.doYouSpeak());
		System.out.println(p.doYouSpeak());
		
		t.whatDoYouDo();
		d.whatDoYouDo();
		p.whatDoYouDo();
	}
}
