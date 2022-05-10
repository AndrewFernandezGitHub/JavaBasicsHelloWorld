package com.syntax.class15;

public class StringMethodTask {
//how to use strings to create parameters such as username and password info for websites
	public static void main(String[] args) {
		String userName = "Andrew";
		String password = "Andrewpass1234";
		String confirmedPassword = "Andrewpass1234";
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else {
			if (password.length() < 8) {
				System.out.println("Password is tooshort");
			} else {
				if (password.contains(userName)) {
					System.out.println("Password can not contain username");
				}else {
					if(password.equals(confirmedPassword)) {
					System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
				}
			}

		}

	}

}
