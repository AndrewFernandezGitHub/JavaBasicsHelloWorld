package com.syntax.class11;

public class ArrayMaxAndMinTwo {

	public static void main(String[] args) {
		//Maximum and minimum in the array
		int[]arr= {10,20,100,40,80,70,};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for (int elements:arr) {
			if(elements>largest) {
				secondLargest=largest;
				largest=elements;
			}else if (elements>secondLargest && elements!=largest) {
				secondLargest=elements;
			}
		}
System.out.println("Largest "+largest);
System.out.println("Second Largest "+ secondLargest);
}
}