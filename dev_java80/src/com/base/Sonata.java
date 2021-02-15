package com.base;

//import java.util.Scanner;

/**
 * @author GEUNDU-HOME
 *
 */
public class Sonata {
	//전역변수 선언
	int wheelNum = 4; //선언과 동시 초기화
	String carColor = "black";
	int x = 0;
	
	
	/***************************************************
	 * 
	 * @param args - 파라미터 타입은 어레이
	 * 파라미터 : 유저가 입력한 값을 받는 곳
	 * 파라미터 자리에도 변수 선언 가능 이것이 지역변수, 초기화 불가능, 콜될때 값이 넘어오기 때문
	 *****************************************************/
	
	public static void main(String[] args) {
		//main method(entry point, 가장 먼저 시작됨. main thread라고도 함, 있어야 exe 생성 가능) - // comment
		//println 모니터에 출력, [35]라인 인스턴스화

		System.out.println("나는 소나타입니다.");
		//system 클래스, out 아웃풋 담당 변수, 입력받으면 system.in
		//지역변수는 변수이름.변수로 호출이 불가하다.
		//지역변수는 반드시 초기화를 해야 사용 가능
		
//		Scanner sc = new Scanner(System.in);
//		String myName;
//		myName = sc.next();
		
		Sonata himCar = new Sonata(); //인스턴스화 instantiate
		//Sonata himCar = null;
		//himCar = new Sonata();로 나눌 수 있음
		System.out.println(himCar.wheelNum);
		int speed;		//variable 선언
		speed = 0;		//variable 초기화, 생략 불가
		System.out.println(speed);
		speed = 50;
		System.out.println(speed);
		speed = 30;
		System.out.println(speed+"\n");
		
	}

}
