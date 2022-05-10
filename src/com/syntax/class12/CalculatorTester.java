package com.syntax.class12;

public class CalculatorTester {

	public static void main(String[] args) {
		Calculator  simpleMathCalculator=new Calculator();
		simpleMathCalculator.add();
		simpleMathCalculator.addNumbers(10, 12, 19);
		simpleMathCalculator.addNumbers(10, 90, 19);
		simpleMathCalculator.addNumbers(10, 40, 19);
		int n1=50;
		int n2=60;
		int n3=10;
		simpleMathCalculator.addNumbers(n1,n2,n3);
	}

}
