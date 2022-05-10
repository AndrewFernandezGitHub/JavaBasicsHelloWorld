package com.syntax.class08;

public class ForLoopPracticeCalculator {
//used when we want to repeat block of code when we know in advance how many times to execute
	
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			System.out.println("Hello");
		}
			System.out.println("Multiplication table");
			/*3*1=3
			 *3*2=6
			 *3*3=9 
			 * the variable I changes
			 */
			int num=7;
			int result;
			for (int i=1;i<=10;i++) {
				result=num*i;
				System.out.println(num+" X "+i+" = "+result);
			}
			System.out.println("What is the output");
			
			for (int i=0; i<=10;i+=3) {
				System.out.println(i+" ");
			}
			System.out.println("What is the output");
			int sum=0;
			for (int i=1;i<=5;i++) {
				sum+=i;//sum=sum+i,
				System.out.println(sum);
			}
			//if the last syso is in this portion and outside of the blo
			//it changes the way the math is done
			System.out.println("What is the output");
			int value=1;
			for (int i=1;i<4;i++) {
				value*=i;
			}
			System.out.println(value);
	}

}
