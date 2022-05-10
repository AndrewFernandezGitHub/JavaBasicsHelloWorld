package com.syntax.class15;

public class StringDemo {

	public static void main(String[] args) {
		String userName="lilly";
		String password="Lilly123";
		if("Lilly".equals(userName)&& "Lilly123".equals(password)) {
			System.out.println("Welcome Back");
		}else {
			System.out.println("USername or password is not correct ");
		}
		if("Lilly".equalsIgnoreCase(userName)&& "Lilly123".equals(password)) {
			System.out.println("Welcome Back");
		}else {
			System.out.println("USername or password is not correct ");
		}

	}

}
