package com.syntax.class10;

public class ArrayHW {

	public static void main(String[] args) {
		String[] cars= {"Audi","BMW","Toyota","Ford","Tesla"};
		//For Classic
		for (int i=0;i<cars.length;i++) {
			System.out.println(cars[i]+" ");
		}
		//For Each
		System.out.println("------");
		for (String car:cars) {
			System.out.println(car +" ");
		}
		
		

	}

}
