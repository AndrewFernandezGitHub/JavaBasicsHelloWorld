package com.syntax.class15;

public class StringMethod4 {
///if you see a -1 it means that is not located in the string,uses index numbering
	public static void main(String[] args) {
String name="How are @you @guys @";
System.out.println(name.indexOf("@"));
System.out.println(name.indexOf("@", 8+1));//the addition of +1 tells java where to start searching the index
System.out.println(name.indexOf("@",name.indexOf("@")+1));
System.out.println(name.lastIndexOf("@"));
System.out.println(name.lastIndexOf("are"));
	}

}
