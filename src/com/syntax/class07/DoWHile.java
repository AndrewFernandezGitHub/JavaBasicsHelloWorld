package com.syntax.class07;

public class DoWHile {

	public static void main(String[] args) {
		int n=2;
		while(n<=3) {
			System.out.println("Hello");//5 times
			n++;//this is while loop
		}//when condition is false while will not work, while loop is used more
		System.out.println("-----");
		// TODO Auto-generated method stub
		int n2=10;//when condition is false, do while gives at lease one output
		do {
			System.out.println("Hello");
			n2++;
			}while (n<=3);

}}
