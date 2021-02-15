package com.vo;

import java.util.Scanner;

public class SumOfInt {

	public static void main(String[] args) {
		int sum;
		
		Scanner s = new Scanner(System.in);
		SumOfIntCalc sumcalc = new SumOfIntCalc();
		System.out.print("정수를 입력하시오 : ");
		sum = s.nextInt();
		
		if (sum <= 0) {
			System.out.println("0보다 큰 정수를 입력하시오.");
		}
		else {
			System.out.println("출력) 정수(n>0):" + sum);
			System.out.println("합계(1~" + sum +"):" + sumcalc.sumofint(sum));
		}
		s.close();
	}
}