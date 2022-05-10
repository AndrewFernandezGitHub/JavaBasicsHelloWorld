package com.syntax.class15;

public class StringsMethod2 {

	void checkUsernamePassword(String userName,String password, String confirmedPassword) {
		String userName1 = "Andrew";
		String password1 = "pass1234";
		String confirmedPassword1 = "pass1234";
		
		
		if (userName1.isEmpty() || password1.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else {
			if (password1.length() < 8) {
				System.out.println("Password is tooshort");
			} else {
				if (password1.contains(userName1)) {
					System.out.println("Password can not contain username");
				}else {
					if(password1.equals(confirmedPassword1)) {
					System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match");
					}
				}
			}

		}

	}

	
	public static void main(String[] args) {
		StringsMethod2 task=new StringsMethod2();
	task.checkUsernamePassword("Andrew", "pass1234", "pass1234");
	}

}
