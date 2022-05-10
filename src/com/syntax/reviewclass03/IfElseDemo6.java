package com.syntax.reviewclass03;

public class IfElseDemo6 {

	public static void main(String[] args) {
		
		String day="Sunday";
		if(day.equals("Sunday")) {
			System.out.println("It is weekend");
		}else if (day.equals("Saturday")) {
			System.out.println("It is weekend");
		}else {
			System.out.println("It is weekday");
		}
		if (day.equals("saturday")||day.equals("sunday")) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Its weekday");
		}
		// TODO Auto-generated method stub

	}

}
