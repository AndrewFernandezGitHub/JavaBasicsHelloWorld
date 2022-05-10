package com.syntax.reviewclass6;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				//first number is controlled by outerloop (int i)
				//int J is the inner loop or second number
			
			System.out.println(i+" "+j);
		}
		
	}//inner loop only gets excetued as long as outer loop is true
		System.out.println("----MULTIPLICATION TABLE----");
		for (int a=1;a<=10;a++) {
			for (int b=1;b<=10;b++) {
				System.out.println(a+" X "+b+" = "+a*b);
			}
			System.out.println("---------");
		}

}
}