package com.MethodOverloading;

public class TestMethod2 {
	static void add(int a,double d) {
		System.out.println("Argument type(int,double)");
	}
	static void add(double d,int a) {
		System.out.println("Argument type(double,int)");
	}
	static void add(double d,double a) {
		System.out.println("Argument type(double,double)");
	}
	static void add(int a,float f) {
		System.out.println("Argument type(int,float)");
	}
	static void add(float f,int a) {
		System.out.println("Argument type(float,int)");
		
	}

	public static void main(String[] args) {
		
		add(3.0,2.0);
	}

}
