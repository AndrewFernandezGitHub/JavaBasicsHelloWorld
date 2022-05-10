package com.syntax.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		String[] countries= {"USA","Italy","England","Germany"};
		String capital=null;
		for(int i=0;i<countries.length;i++) {
			System.out.println(countries[i]);{
				switch(countries[i]) {
				case "USA":
					capital="DC";
					break;
				case "Italy":
					capital="Rome";
					break;
				case "England":
					capital="London";
					break;
				case "Germany":
					capital="Berlin";
					break;
				}
			}System.out.println("The capital of the country "+countries[i]+" "+capital);
		}
			
		System.out.println("Another way");
		for (String country:countries) {
			if(country.equals("USA")) {
				capital="Warsaw";
			}else if (country.equals("Italy")) {
				capital="Rome";
			}else if (country.equals("Germany")) {
				capital="Berlin";;
			}else if (country.equals("England")) {
				capital="London";
			}System.out.println("The capital of the country "+country+" "+capital);
		}

	}}


