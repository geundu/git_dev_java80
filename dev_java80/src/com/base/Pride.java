package com.base;

public class Pride {
	
	int wheelNum = 4; //전역변수는 선언과 초기화를 분리할 수 없다.
	int i = 10;
//	Pride herCar = new Pride(); //인스턴스화
	//herCar.wheelNum = 6; >> 선언부에는 초기화와 선언을 분리할 수 없다.
	void go(int x) {
		x = 10;
	}
	
	public static void main(String[] args) {
		
		Pride herCar = new Pride(); //인스턴스화
		Pride himCar = new Pride(); //인스턴스화
		
		System.out.println("자동차 바퀴의 개수는 " + herCar.wheelNum + "개");
		himCar.wheelNum = 6; //초기값 변경 가능
		//non-static 변수 wheelNum은 static 영역인 main 안에서 사용할 수 없다.
		//인스턴스화를 하면 내 안에 있는 변수나 메소드를 호출할 수 있다.
		/* 지역변수는 himCar.x와 같이 사용할 수 없다. stack에 할당되어 JVM에 자원관리를 받는다.
		 * 전역변수만이 아래와 같이 사용 가능하다.
		 * himCar.x = 100;
		 */
		System.out.println("자동차 바퀴의 개수는 " + herCar.wheelNum + "개");
		System.out.println("자동차 바퀴의 개수는 " + himCar.wheelNum + "개");
		
	}

}
