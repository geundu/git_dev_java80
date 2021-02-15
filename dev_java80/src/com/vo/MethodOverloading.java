package com.vo;

public class MethodOverloading {
	
	/********************************
	 * @param pdvo - 조건절에서 사용될 상수값을 담음 - where절에 들어갈 조건값으로 사용됨 
	 * @return rdvo - 오라클에서 조회된 결과를 담음 - 화면 출력용으로 사용
	 *******************************/
	//메서드 이름은 같은데 서로 다른 메서드로 인식한다
	
	DeptVO go(DeptVO pdvo) {
		System.out.printf("%d, %s, %s", pdvo.getDeptno(), pdvo.getDname(), pdvo.getLoc());
		DeptVO rdvo = null;
		rdvo = new DeptVO();
		//오라클을 경유한 다음 조회결과를 받아온 내용을 담는 클래스이다.
		return rdvo;
	}
	void go() {
		System.out.println("void go() called");
	}
	void go(int num) {
		System.out.println("void go(int num) called");
	}
	void go(String name) {
		System.out.println("void go(String name) called");	
	}
	
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.go();
		mol.go(10);			//call by value
		mol.go("Smith");	//call by reference. String은 예외. 값이 출력됨
		
		DeptVO pdvo = new DeptVO();
		
		mol.go(pdvo);
		
		pdvo.setDeptno(50);
		pdvo.setDname("개발1");
		pdvo.setLoc("제주");
		
//		System.out.printf("%d, %s, %s", pdvo.getDeptno(), pdvo.getDname(), pdvo.getLoc());
		
		
	}

}

/******
 * 물건을 주문하였다 주문 내용을 확인하고 싶을 때 조건 검색을 해야 한다
 * 왜냐하면 주문건수가 많기 때문이다
 * SELECT 
 * FROM 회원집합, 주문집합
 * WHERE 회원집합.아이디(로그인한 아이디 = 세션 - 시간동안 기억하는 클래스;이란 저장소에 담겨있는 아이디값) = 주문집합.아이디 같은가?
 * AND 주문일자 > '2021-02-01'
 * 
 * 
 * 조건에 필요한 값이 두 가지이다
 * 변수 1 그 중 하나는 로그인한 나의 아이디
 * 변수 2 또 하나는 주문한 일자
 * 하나 이상일 때는 EdptVO를 이용하는 것이 좋다
 * 여러 개 넘기는 것이 불편하니까
 * 
 * 조회결과로는 주문한 사람의 이름과 주문날짜, 주문금액
 * 주문수량 등 여러 값을 관리해야 함
 * 이유는 핸드폰이나 컴퓨터에서 그 목록을 모두 조회할 수 있어야 하기 때문 - 출력을 내보내야 한다
 * ㄴDeptVO를 이용할 수 있다
 * 
 */