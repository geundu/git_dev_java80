package com.vo;

public class WeightCalc {
	void calc(double weight) {
		weight *= 0.17; 
		System.out.println("달에서의 몸무게 : " + String.format("%.2f", weight));
	}
}



