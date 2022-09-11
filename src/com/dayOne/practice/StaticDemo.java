package com.dayOne.practice;

public class StaticDemo {

	static int a = 3;
	static int b;

	static void valOfVariables(int x) {
		System.out.println("value of b = " + b);
		System.out.println("value of x = " + x);
	}

	static {
		System.out.println("Static block initialized.");
		System.out.println("value of a = " + a);
		b = a * 4;
	}
	void substration() {
		int d=b-a;
		System.out.println(d);
	}

	public static void main(String args[]) {
		valOfVariables(42);
		StaticDemo sd=new StaticDemo();
		sd.substration();
		
	}

}
