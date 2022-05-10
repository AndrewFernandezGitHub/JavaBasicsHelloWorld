package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		int i=10;
		double d=10;
		
		//widening or implicit, we store int value inside double variable
		System.out.println(i);
		System.out.println(d);
		
		//Casting-always know the answers for what(process of converting the value from one type to another) and why (
		//two types of Casting 1.Widening/Implicit/Automatic and 2. Narrowing/Explicit/Manual
		
		//1. Takes something small and make it big
		//byte->short->int->long->ffloat->double
		
		//2. Takes Something big and make it small
		//double->float->long->int->short->byte
		
		//main+ctrl+space---> auto completes main method
		//ctrl+space autocompletes main method also
		
		//we can caste primitive and non primitive data types 
		
		int num=(int)10.99;
		System.out.println(num);
		
		byte b=(byte)1000;
		//^narrowing or explicit casting
		
		//we store double value 10.99 into int variable
		
		long number=111223484848338l;
		System.out.println(number);
		
		int numb=(int)111223484848338l;
		System.out.println(numb);
		// TODO Auto-generated method stub

	}

}
