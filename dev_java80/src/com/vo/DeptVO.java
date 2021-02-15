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
 */
public class DeptVO {
	
	private int deptno = 0;
	private String dname = null;
	private String loc = null;

}
