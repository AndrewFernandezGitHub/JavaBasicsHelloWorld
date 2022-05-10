package com.syntax.class14;

public class Prime {
	
	boolean isPrime(int number) {
		boolean isPrime=true;
		if (number>1) {
			for(int i=2;i<number;i++) {
				if (number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		//Write a method to return whether given number is prime or not
		Prime obj=new Prime();
		System.out.println(obj.isPrime(13));
	}

}
