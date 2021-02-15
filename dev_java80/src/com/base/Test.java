package com.base;


/* 괄호 존재하는 경우
 * ():메서드 
 * ():생성자(constructor)
 * ():캐스팅 연산자
 * 
 */


public class Test {

	public static void main(String[] args) {
		float f = 3.1415929f;
		double d = 3.14;
		System.out.println(d);
		d = f;
		System.out.println(f);
		
		//f = d; // size error (8Bytes to 4Bytes)
		f = (float)d; // casting operator 강제형변환
		System.out.println(f);
		
	}

}
