package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		char choice='y';
		String answer;
		
		switch (choice) {
		case 'y':
			answer="Yes";
			break;
		case 'n':
			answer="No";
			break;
		case 'm':
			answer="Maybe";
			break;
		default:
			answer="unknown";
			break;
		}
		System.out.println(answer);
		// TODO Auto-generated method stub

	}

}
