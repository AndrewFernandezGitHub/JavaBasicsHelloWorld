package com.syntax.class15;

public class StringTask2 {

	public static void main(String[] args) {
/*create a string and if the string is not empty perform the following
 * if string has an odd number of characters and has 3 or more characters, print
 * the character in the middle of the string
 */
		
		String str="HeLlo";
		
		if (str.length()%2!=0&&str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
		}
	}

}
