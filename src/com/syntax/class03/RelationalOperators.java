package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2);//false
		System.out.println(num1==num2);//false
		System.out.println(num1<num2);//true
		
		//any time using relational operators, the result will always be a boolean value (true or false)
		
		boolean  result=num1==num2;
		
		System.out.println("Result is "+ result);
		
		System.out.println(num1=num2);//= is assignment operator, == is relational operator 
		System.out.println(num1==num2);
		// TODO Auto-generated method stub

	}

}
