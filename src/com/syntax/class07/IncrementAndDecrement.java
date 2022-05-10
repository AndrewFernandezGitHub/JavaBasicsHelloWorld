package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int num=10;
		num=num+1;
		num+=1;
		num++;
		//using two + signs, we can add 1 to the variable
		System.out.println(num);
		
		//increment operator add 1 to a VARIABLE
		num++;
		System.out.println(num);
		//10++;CE Invalid argument to operation ++/--, only works with variable not values
		//decrement operator subtract 1 from variable
		
		num--;
		num--;
		num--;
		System.out.println(num);

	}

}
