package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.println("I am code inside for loop");
			if (i == 3) {
				break;
			}
		}
		System.out.println("end of code");
		boolean winter = true;
		int temp = 0;
		while (winter) {
			System.out.println("It is cold");

			if (temp == 20) {
				break;
			}
			temp+=5;
		}
		// TODO Auto-generated method stub

	}

}
