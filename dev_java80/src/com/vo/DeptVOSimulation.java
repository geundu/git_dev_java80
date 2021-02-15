package com.vo;

public class DeptVOSimulation {
	
	DeptVO methodA() {
		return new DeptVO();
	}
	DeptVO[] methodB() {
		return new DeptVO[3];
	}

	public static void main(String[] args) {

		DeptVO dvo = new DeptVO();
		
		int myDeptNo = dvo.getDeptno();
		String myDname = dvo.getDname();
		String myLoc = dvo.getLoc();
		
		System.out.printf("%d, %s, %s\n", myDeptNo, myDname, myLoc);
		
		dvo.setDeptno(50);
		dvo.setDname("유성열");
		dvo.setLoc("서울시 금천구");
		
		myDeptNo = dvo.getDeptno();
		myDname = dvo.getDname();
		myLoc = dvo.getLoc();
		
		System.out.printf("%d, %s, %s\n", myDeptNo, myDname, myLoc);
		
		dvo = new DeptVO(30);
		
		myDeptNo = dvo.getDeptno();
		myDname = dvo.getDname();
		myLoc = dvo.getLoc();
		
		System.out.printf("%d, %s, %s", myDeptNo, myDname, myLoc);
	}

}
