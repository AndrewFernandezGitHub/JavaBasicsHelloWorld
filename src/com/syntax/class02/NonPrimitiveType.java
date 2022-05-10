package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		
		String name="Andrew";
		
		String lastName="Marcela";
		
		long phoneNumber =1234567890;
		
		//to make it a string, add "", any value we place inside "" is the string
		
		String mobileNumber="123-456-7890";
		
		String num="123";
		int num1=123;  
		
		//String greeting = "Hellow Friends!"; to represent letters and special characters
		
		String greeting="Hello Friends!";
		
		System.out.println(greeting);
		
		//short cut for system.out.println is syso+ctrl+space  --> autocomplete print statement
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(name+" "+lastName);
		
		/* using + we can concatenate(attach strings)
		 * String + String
		 * String + int
		 * String + bolean
		 * String + double,char, etc
		 */
		
		int age=25;
		//Andrew is 25 years old
		//add the space in the quotations in order to avoid clutter
		System.out.println(name+" "+"is"+" "+age+" years old");
		
		String address="123 Test Streeet";
				//I Live on 123 Test Street
				
				System.out.println("I live on "+address);
				
				String feeling="like";
				String food="kebab";
				// I like kebab
				
				System.out.println("I "+feeling+" "+food);
				
				feeling="love";
				food="wings";
				
				System.out.println("I "+feeling+" "+food);
		
	}

}
