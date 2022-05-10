package com.syntax.class08;

public class LoopTaskDifferentOddEvenNumbersSum {
//this way works but see Loop Task to see how to write same thing with shorter code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=2;i<=50;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		int sum1=0;
		for (int i=1;i<=50;i+=2) {
			sum1+=i;
		}
		System.out.println(sum1);
		

	}

}
