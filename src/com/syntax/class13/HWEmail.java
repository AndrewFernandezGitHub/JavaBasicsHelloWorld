package com.syntax.class13;

public class HWEmail {
	String createEmail(String userName,String lastName, String emailType) {
		return userName+lastName+"@"+emailType+".com";
	}

	public static void main(String[] args) {
		HWEmail email=new HWEmail();
		System.out.println(email.createEmail("drew", "blue", "gmail"));
	}

}
