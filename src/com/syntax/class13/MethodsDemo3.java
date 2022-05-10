package com.syntax.class13;

public class MethodsDemo3 {
	//int we specify the datatpye that method will return 
	//squareTheNumber is the name of the method
	//(int number)parameters of the method
	//return tell java what to return from this method
	int squareTheNumber(int number) {
		return number*number;

		
	}
	int returnTheSameNumber(int number) {
		return number;
	}
	
	String getProperAnimalByExpert(String expertName, String animalName) {
		if("Andrew".equalsIgnoreCase(expertName)&& "Horse".equalsIgnoreCase(animalName)) {
			return "camel";
		}else if ("Horse".equals(animalName)) {
			return "horse";
		}else {
			return "I dont know";
		}
	}
	
	
	

	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3();
		int result=obj.squareTheNumber(7);
		System.out.println(result);
		
		System.out.println(obj.getProperAnimalByExpert("Andrew", "Horse"));
		System.out.println(obj.getProperAnimalByExpert("AnDRew", "HoRSe"));
		System.out.println(obj.getProperAnimalByExpert("Andrew", "Bill"));
	}

}
