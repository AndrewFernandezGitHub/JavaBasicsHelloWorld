package com.syntax.class06;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		String car="BMW";
		String country;
		
		switch(car) {
		case "BMW":
			country="Germany";
			break;
		case "ford":
			country="USA";
			break;
		case "Lada":
			country="Russia";
			break;
		case "Toyota":
			country="Japan";
			break;
		default:
			country="Unknown";
		}
		System.out.println(car +" is from "+country);
		// TODO Auto-generated method stub

	}

}
