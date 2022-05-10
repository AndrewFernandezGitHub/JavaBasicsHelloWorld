package com.syntax.class10;

public class AllFromTwoDArray {

	public static void main(String[] args) {
String [][]food= {
		{"Wings","Burgers","Fries"},
		{"Rice","Chicken Tikka","Curry"},
		{"Pasta","Pizza","Mozzarella"},
		{"Noodles","Drunken Noodles"}
};
for (int row=0;row<food.length;row++) {
	for(int col=0; col<food[row].length;col++) {
		System.out.println(food[row][col]);
	}
}
	}

}
