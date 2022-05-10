package com.syntax.class06;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		
		int n1=1000;
		int n2=2000;
		int n3=300;
		int largest = 0;
		if (n1>n2 && n1>n3) {
			largest=n1;
		}else if (n2>n1 && n2>n3){
			largest=n2;
			
		}else if (n3>n1 && n3>n2) {
			largest=n3;
		}
		System.out.println(largest);
		// TODO Auto-generated method stub

	}

}
