package com.syntax.class12;

public class Phone {
	String name;
	String os;
	String plan;
	
	void phone(){
		System.out.println("My phone is "+name);
	}
	void own() {
		System.out.println("My "+name+" is on a "+plan);
	}
	void software() {
		System.out.println("My "+name+" is on a "+plan+" and uses "+os);
	}
	void printCompleteInfo() {
		System.out.println("Name is = "+name);
		System.out.println("Software is = "+os);
		System.out.println("Plan is = "+plan);
	}


	public static void main(String[] args) {
		Phone iphone=new Phone();
		iphone.name="iphone";
		iphone.os="iOS";
		iphone.plan="Family Plane";
		iphone.phone();
		iphone.software();
		iphone.own();
		iphone.printCompleteInfo();
		
		Phone pixel=new Phone();
		pixel.name="Pixel";
		pixel.os="Chrome OS";
		pixel.plan="Lease";
		pixel.phone();
		pixel.software();
		pixel.own();pixel.printCompleteInfo();
		
		Phone Nokia=new Phone();
		Nokia.name="Nokia";
		Nokia.os="Ashel";
		Nokia.plan="Own";
		Nokia.phone();
		Nokia.software();
		Nokia.own();pixel.printCompleteInfo();
		
		

	}

}
