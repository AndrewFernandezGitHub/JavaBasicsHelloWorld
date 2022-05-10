package com.syntax.GitHub;

public class LoopDraw {

	public static void main(String[] args) {
		for(int a=1;a<=3;a++) {
			System.out.println("I am I loop "+a);
		}for (int b=1;b<=2;b++) {
			System.out.println("I am nested j loop" + b);
			int d=2;
			System.out.println(b+d);
		}System.out.println("Outside loop");

	}

}
