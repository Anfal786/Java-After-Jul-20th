package com.mak.exception_handling;

public class ExceptionDevideByZero {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		}
		catch(Exception e) {
			System.out.println("Cannot Devide By Zero Error!!!");
		}
	}
}
