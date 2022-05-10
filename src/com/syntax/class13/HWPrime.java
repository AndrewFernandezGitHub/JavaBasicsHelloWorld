package com.syntax.class13;

public class HWPrime {
	String isPrime(int num) {
		if (num>1) {
			for (int i=2;i<num;i++) {
				if(num%i==0) {
					return num+" is not a prime number";
				}
			}
		}else {
			return num + " is not a prime number";
		}
		return num+ "is prime number";
	}
	
	

	public static void main(String[] args) {
		HWPrime obj=new HWPrime();
		System.out.println(obj.isPrime(33));
		System.out.println(obj.isPrime(29));

	}

}
