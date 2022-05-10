package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		int num=1;
		int[]numbers=new int[4];
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);//189
		//when arrays are ints, can be added, when strings, it concates
		//i want to create an array of countries
		String[]countries=new String[5];//enter how many to store in array
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Italy";
		countries[3]="Germany";
		countries[4]="Spain";
		
		
		System.out.println(countries[3]+countries[4]);
		
		//array of names
		String[] names=new String[5];
		names[0]="Andrew";
		names[1]="Marcela";
		names[2]="Matt";
		names[3]="Alex";
		names[4]="Maria";
		System.out.println(names[2]);
		//create array to store different prices 4 different prices
		//find average of how much we spent
		double[] price=new double[4];
		price[0]=1.99;
		price[1]=2.99;
		price[2]=3.99;
		price[3]=4.99;
		System.out.println(price[0]+price[1]+price[2]+price[3])/4;

	}

}
