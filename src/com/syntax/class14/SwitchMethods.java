package com.syntax.class14;

public class SwitchMethods {
	/*
	 * Create a method that will say Hello in different language based on the country
	 * that will passed when method is executed
	 */
	String sayHello(String country) {


        String returnedCountry = "";

        switch (country) {
            case "USA":
                returnedCountry = "Hello";
                break;
            case "France":
                returnedCountry = "Bonjour";
                break;
            case "Turkey":
                returnedCountry = "Merhaba";
                break;
            default:
                returnedCountry ="Unknown";

        }
        return returnedCountry;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SwitchMethods object=new SwitchMethods();
        String country=object.sayHello("USA");
        System.out.println(country);
    }
}