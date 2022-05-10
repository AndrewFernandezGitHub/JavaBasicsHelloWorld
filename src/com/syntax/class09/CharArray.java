package com.syntax.class09;

public class CharArray {

	public static void main(String[] args) {
		char[] letters= {'A','B','C','D','E','F'};
		System.out.println("My letter is "+letters[1]);
		int size=letters.length;
		System.out.println("Number of elements is = "+size);
		System.out.println(letters[1]);
		for(int i=0;i<letters.length;i++) {
			System.out.println(letters[i]);
		}
		String[] cities= {"Washington","Tampa","DC","New York"};
		for (int a=0;a<cities.length;a++) {
			System.out.println(cities[a]);
			if(cities[a].equals("Tampa")) {
				System.out.println("I want to live in miami");
			}
		}
	
	}
}
