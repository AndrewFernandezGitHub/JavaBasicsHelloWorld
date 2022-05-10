package com.syntax.class13;

public class HWEvenOdd {
	String getEvenOrOddNum(int num) {
		if(num%2==0) {
			return num+" is even";
		}else {
			return num+" is odd";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HWEvenOdd obj=new HWEvenOdd();
System.out.println(obj.getEvenOrOddNum(7));
System.out.println(obj.getEvenOrOddNum(12));
	}

}
