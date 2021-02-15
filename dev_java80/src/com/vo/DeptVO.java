package com.vo;

//오라클과 자바 연동
//VO패턴 - 데이터의 영속성을 유지해주는 오라클 서버 제품과 연결하기
//데이터를 관리할 목적 - 모든 집합의 이름 뒤에 접미어로 VO를 붙임
//메인메서드는 필요 없다 단독으로 실행하지 않는다
/************************
 * 
 * Number(2) - 정수형 담을 수 있는 최대 크기는 0~99까지 임계값
 * 			 - 자바에서는 int(4Bytes), long(8Bytes)으로 받음
 *  carchar2(4000) - String
 *  VO패턴을 사용하면 한꺼번에 3가지 종류(부서번호, 부서명, 위치)의 값을 관리 가능함
 *  서버 자체는 항상 동시에 여러 사람이 접속할 수 있다
 *  여러 사람을 따로 관리할 수 있어야 한다 - Thread 공부 - 직접 서버 운영할 수 있는 코딩 보여줌.
 *  Instantiate 하는 이유
 *  DeptVO dvo = new DeptVO();
 *  
 *  dvo = new DeptVO();
 *  
 *  dvo = new DeptVO();
 */
public class DeptVO {
	
	private int 	deptno = 0;		//primitive type 콜하면 값 4Bytes
	private String 	dname = null;	//reference type 클래스급, value가 아닌 address. 
	private String 	loc = null;		//레퍼런스 타입인데 값이 출력돼서 예외
	
	DeptVO() {
		System.out.println("DeptVO() called");
		deptno = 30;
		dname = "근두";
		loc = "안양시";
	}
	DeptVO(int deptno) {
		System.out.println("DeptVO(int deptno) called");
		this.deptno = deptno;
	}
	
	//getter 메서드 - read
	public int getDeptno() {
		return deptno;
	}
	//setter 메서드 - write, save
	public void setDeptno(int deptno) {
//		deptno = 30; 상수, 비추천
//		this는 자기 자신을 가리키는 수정자, 생략 가능하다
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
