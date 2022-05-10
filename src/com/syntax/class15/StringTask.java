package com.syntax.class15;

public class StringTask {

	public static void main(String[] args) {
		String father="Dan";
		String mother="Mariam";
		String expecting="boy";
		String firstPart="";
		String secondPart="";
		if(expecting.equalsIgnoreCase("Boy")) {
			firstPart=father.substring(0, father.length()/2);
			secondPart=mother.substring(0, mother.length()/2);
		}else if(expecting.equalsIgnoreCase("girl")){
			firstPart=mother.substring(0,mother.length()/2);
			secondPart=father.substring(0,father.length()/2);
		}
			System.out.println(firstPart+secondPart);
		}
	}


