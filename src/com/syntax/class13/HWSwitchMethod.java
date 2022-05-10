package com.syntax.class13;

public class HWSwitchMethod {
	String sayHello (String country) {
		switch (country) {
		case "USA":
			return "Hello";
		case "France":
			return "Bonjour";
		case "Italy":
			return "Ciao";
			default:
				return "Unknown";
		}
	}

	public static void main(String[] args) {
		HWSwitchMethod obj=new HWSwitchMethod();
		System.out.println(obj.sayHello("France"));
		System.out.println(obj.sayHello("USA"));
		System.out.println(obj.sayHello("Italy"));
	}

}
