package com.syntax.class04;

public class NestedIfExercise3 {

	public static void main(String[] args) {
		
		int age=18;
		int weight=1;
		
		if (age>=18) {
			System.out.println("You are of age to donate blood lets check weight");
			if (weight>=110) {
				System.out.println("You are elgibile to donate");
			}else {
				System.out.println("Sorry you are not eligible to donate by weight");
			}
		}else {
			System.out.println("You are not eligible by age");
		}
		
		
	}

}
