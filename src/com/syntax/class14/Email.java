package com.syntax.class14;
/*
 * create a method createEmail().Based on values of users name,
 * lastName and emailType, your method should return complete email
 * address. Example:createEmail(John,snow,gmail)johnsnow@gmail.com
 */
public class Email {
	
	String createEmail(String userName, String lastName, String emailType) {
		return userName+lastName+"@"+emailType+".com";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Email obj=new Email();
System.out.println(obj.createEmail("drew", "love", "gmail"));
	}

}
