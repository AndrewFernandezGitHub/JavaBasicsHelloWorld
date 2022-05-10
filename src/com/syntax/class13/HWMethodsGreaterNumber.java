package com.syntax.class13;

public class HWMethodsGreaterNumber {
	void largest(int a, int b) {
		if(a>b) {
			System.out.println("Number "+ a + " is greater than "+b);
		}else if (b>a) {
			System.out.println("Number "+ b + " is greater than "+a);
		}else {
			System.out.println("number "+ a +" is equal to "+ b);
		}
	}

	public static void main(String[] args) {
		HWMethodsGreaterNumber obj1=new HWMethodsGreaterNumber();
		obj1.largest(12, 11);
		

	}

}
