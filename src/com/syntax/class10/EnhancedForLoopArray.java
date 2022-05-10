package com.syntax.class10;

public class EnhancedForLoopArray {
//how to retrieve all elements from 2d array with FOR EACH loop
	public static void main(String[] args) {
		String [][]food= {
				{"Wings","Burgers","Fries"},
				{"Rice","Chicken Tikka","Curry"},
				{"Pasta","Pizza","Mozzarella"},
				{"Noodles","Drunken Noodles"}
		};
System.out.println("ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP");
//outer loops over each array inside 2d Array
for(String[] cuisine:food) {
	//inner loop over each element from selected array
	for(String f:cuisine) {
		System.out.print(f+" ");
	}
	System.out.println();
}
	}

}
