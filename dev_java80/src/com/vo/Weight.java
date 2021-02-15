package com.vo;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		WeightCalc wc = new WeightCalc();
		
		System.out.print("몸무게를 입력하시오 : ");
		double w = s.nextDouble();

		wc.calc(w);
		
		s.close();
	}

}
