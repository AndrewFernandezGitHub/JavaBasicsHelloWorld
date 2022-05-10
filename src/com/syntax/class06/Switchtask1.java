package com.syntax.class06;

import java.util.Scanner;

public class Switchtask1 {

	public static void main(String[] args) {
		// ask user to enter their country and capture it.
		// once values are captured, print which language user speaks

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your country please");
		String country = input.nextLine();
		String language;

		switch (country.toLowerCase()) {
		case "USA":
			language = "English";
			break;
		case "France":
			language = "French";
			break;
		case "Japan":
			language = "Japanese";
			break;
		case "Italy":
			language = "Italian";
			break;
			
		default:
			language = "unknown";}
		input.close();
			System.out.println("In " + country + " people speak " + language);

		}

	}


