package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Andrew";//This version is shortest
		String name2 = new String("Marcela  IN ALL UPPER CASE ");
		System.out.println(name);
		System.out.println(name2);

		System.out.println(name.length());
		String newName = name2.toLowerCase();
		System.out.println(name2.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(name+name2);//preferred concatination method
		System.out.println(name.concat(name2));
		
		name="    ";
		System.out.println(name.isEmpty());
		

	}

}
