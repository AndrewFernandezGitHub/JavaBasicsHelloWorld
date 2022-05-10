package com.syntax.reviewclass6;

public class Worlds {

	public static void main(String[] args) {
		Methods human1=new Methods();
		human1.name="Andrew";
		human1.lastName="Fernandez";
		human1.hairColor="Brown";
		human1.eyeColor="Hazel";
		human1.age=21;
		human1.gender='m';
		//human1.hands=2; hands was not declared in methods, cant be used
		
		//below you can also recall the behaviors for the obj created, as long as the behavior was previously made in the methods
		human1.sleep();
		human1.eat();
		human1.run();
		//human1.tired; since tired wasnt defined as a behavior, cant be used. 
//if you dont have the class, you cant 
	}

}
