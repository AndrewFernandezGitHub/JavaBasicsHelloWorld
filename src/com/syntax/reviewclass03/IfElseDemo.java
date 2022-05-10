package com.syntax.reviewclass03;

public class IfElseDemo {

	public static void main(String[] args) {
		String userName = "Asghar";
		String password = "pass123";
		/*
		 * when comparing strings(non primitive), use .equals when its primitive use ==
		 * when comparing variables
		 */
		if (userName.equals("Asghar") && password.equals("pass123")) {
			System.out.println("welcome back " + userName);
		} else {
			System.out.println("UserName or password is not correct");
		}

	}

}
