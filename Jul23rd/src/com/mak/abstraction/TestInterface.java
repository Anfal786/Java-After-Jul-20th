package com.mak.abstraction;

class SonyRemote implements TVRemote {

	@Override
	public void switchOff() {
		System.out.println("Switching On Sony");
	}

	@Override
	public void swicthOn() {
		System.out.println("Switching Off Sony");
	}
}

class OnidaRemote implements TVRemote {

	@Override
	public void switchOff() {
		System.out.println("Switching On Onida");
	}

	@Override
	public void swicthOn() {
		System.out.println("Switching Off Onida");
	}
}

public class TestInterface {
	public static void main(String[] args) {
		TVRemote sonyRemote,onidaRemote;
		sonyRemote = new SonyRemote();
		onidaRemote= new OnidaRemote();
		
		sonyRemote.swicthOn();
		sonyRemote.switchOff();
		
		onidaRemote.swicthOn();
		onidaRemote.switchOff();
	}
}
