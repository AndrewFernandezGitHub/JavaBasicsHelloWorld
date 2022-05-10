package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		String name="       Andrew         ";
		System.out.println(name);
		System.out.println(name.trim());
		
		String name2="Run Andrew";
		System.out.println(name2.toLowerCase().startsWith("Run"));//method chaining, multiple methods on one line
		System.out.println(name2.startsWith("Run"));
		System.out.println(name2.endsWith("Moreed"));
		System.out.println(name2.endsWith("d"));
		System.out.println(name2.contains("M"));
		System.out.println(name2.toLowerCase().contains("m"));
		System.out.println(name2.equalsIgnoreCase(name2));

	}

}
