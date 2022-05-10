package com.syntax.reviewclass4;

public class IfElse2 {

	public static void main(String[] args) {
		
		int number=10;
		boolean isTrue=false;
		double number2=10.5;
		
		if(number>5) {
			if(isTrue) {
				if(number2>15) {
					System.out.println("1");
				}else {
					System.out.println("2");
				}
			}else {
				System.out.println("3");
				if (number<15) {
					System.out.println("4");
				}else {
					System.out.println("5");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
