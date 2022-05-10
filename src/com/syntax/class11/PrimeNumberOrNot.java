package com.syntax.class11;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		//Write java program to check whether number is prime or not
		//if number is not greater than 1, it is not prime
		//if a number is not greater than 1 it is not prime
		//if num is greater than 2, divide that number with all the numbers
		//check if you get a remainder other than 0 if yes, tht number is not prime
		//
		int number=3;
		boolean isPrime=true;
		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println(number+" isPrime "+isPrime);

	}

}
