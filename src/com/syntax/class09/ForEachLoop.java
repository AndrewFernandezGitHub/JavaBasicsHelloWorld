package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] cities = { "Washington", "Tampa", "DC", "New York" };
		// if you have an arrayy you can use for each loop to iterate/loop through the
		// entire array
		// TODO Auto-generated method stub
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("--------");
		int[] numbers = { 10, 20, 30, 40 };
		for (int n : numbers) {
			System.out.println(n);
		}
		System.out.println("-------");
		char[] grades= {'A','B','C','D','E'};
		for (char grade:grades) {
			System.out.println(grade+" ");
		}
	}

}
