package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time=17;
		if (time<12) {
			System.out.println("morning");//1
		}
		System.out.println("---------");
		while (time<10) {
			System.out.println("Morning");//2
			time++;//also works with negative operator--
		}
		System.out.println("End of the code");
		// TODO Auto-generated method stub

	}

}
