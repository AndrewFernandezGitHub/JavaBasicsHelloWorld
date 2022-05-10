package com.syntax.class13;

public class Methodsdemo2 {
	void AndrewAndHorse(String personName,String animalName) {
	if("Andrew".equals(personName)&& "Horse".equals(animalName)) {
		System.out.println("This is camel");
	}else if ("horse".equalsIgnoreCase(animalName)){
		System.out.println("This is a horse");
	}
	}
	public static void main(String[] args) {
		Methodsdemo2 obj=new Methodsdemo2();
		obj.AndrewAndHorse("Andrew", "Horse");
		obj.AndrewAndHorse("Marcela", "Horse");

	}

}
