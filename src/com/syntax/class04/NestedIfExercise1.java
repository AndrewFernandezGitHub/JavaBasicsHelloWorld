package com.syntax.class04;

public class NestedIfExercise1 {

	public static void main(String[] args) {
		
		/*WRITE A PROGRAM TO STORE A BOOLEAN VALUE OF WHETHER USER HAS DIPLOMA OR NOT. 
		 * IF USER HAS A DIPLOMA, YOU SHOULD SAY CONGRATULATIONS, OTHER WISE PROGRAM SHOULD SUGGEST TO GET A DEGREE. THEN IF USER HAS A DEGREE PROGRAM SHOULD CHECK GPA. 
		 * IF GPA IS >=3.5, OUTPUT SHOULD SAY YOUR ARE ELIGIBLE FOR SCHOLARSHIP
		 * OTHERWISE IT SHOULD SAY YOU SHOULD HAVE STUDIED HARDER
		 */
		
		boolean diploma=true;
		
		if(diploma) {
				System.out.println("Congratulations");
			}	
			double gpa=3.2;
			if(gpa>=3.5) {
				System.out.println("You are elgibile for scholarship");
			}
			else {
				System.out.println("You should have studied harder");
			}
			
	
}}
