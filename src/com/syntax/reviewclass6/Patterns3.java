package com.syntax.reviewclass6;

public class Patterns3 {
//the inner loop prints the columns and the values you want in the columns
//the outer loop row tells it when to move down the row after filling the columns
	public static void main(String[] args) {
		for (int row=1;row<=4;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(row+" ");
			}System.out.println();
		}

	}

}
