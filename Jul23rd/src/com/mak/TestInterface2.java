package com.mak;

class Employee implements TestInterface1 {
	double salary;
	String name;

	public Employee(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	@Override
	public int compareTwo(Object o) {
		return (int) (this.salary - ((Employee) o).salary);
	}
}

class Apple implements TestInterface1 {
	double price;
	String source;

	public Apple(double price, String source) {
		super();
		this.price = price;
		this.source = source;
	}

	@Override
	public int compareTwo(Object o) {
		return (int) (this.price - ((Apple) o).price);
	}
}

public class TestInterface2 {
	public static void main(String[] args) {
		Employee e1, e2;
		Apple a1, a2;

		e1 = new Employee(5000, "MAK");
		e2 = new Employee(9000, "KAM");
		int diff = e1.compareTwo(e2);
		if (diff > 0)
			System.out.println(e1.name + " is having " + diff + " more salary");
		else
			System.out.println(e2.name + " is having " + Math.abs(diff) + " more salary");

		a1 = new Apple(90, "Kashmir");
		a2 = new Apple(60, "IceLand");
		diff = a1.compareTwo(a2);
		if (diff > 0)
			System.out.println(a1.source + " apples are " + diff + "Rs costlier than " + a2.source + " apples");
		else
			System.out.println(a2.source + " apples are " + Math.abs(diff) + "Rs costlier than " + a1.source + " apples");

	}
}
