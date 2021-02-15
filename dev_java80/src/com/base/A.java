package com.base;

public class A {
	
	int age = 30;
	
	int result(int x) {
		
		x = age;
		return x;
	}
	
	public static void main(String[] args) {
		A a = null;//null pointer exception 발생x 
		
//		a = new A(); //30
		
//		A b = new A();
		
//		a.age+=1;
		System.out.println("sdfasdf");
		System.out.println("asdfasdfasd");
		System.out.println(a.age);
		System.out.println("널이면 여기가 안 나옴");
		
//		System.out.println(b.result(0));
		
	}

}
