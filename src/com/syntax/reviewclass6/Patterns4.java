package com.syntax.reviewclass6;
public class Patterns4 {
//the inner loop prints the columns and the values you want in the columns
//the outer loop row tells it when to move down the row after filling the columns
	public static void main(String[] args) {
		for (int row=1;row<=4;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(col+" ");
			}System.out.println();
		}for (int r=5;r>=1;r--) {
			for(int c=5;c>=1;c--) {
				System.out.print(r+" ");
			}System.out.println();
		}

	}

}
