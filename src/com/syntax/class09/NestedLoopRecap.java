package com.syntax.class09;

public class NestedLoopRecap {

	public static void main(String[] args) {
		for(int a=1;a<=4;a++) {
			System.out.println("A");
			//break or continue
			System.out.println("B");
		}
System.out.println("---------");
for (int i=1;i<=3;i++) {
	for (int j=1;j<=3;j++) {
		for(int d=1;d<=3;d++) {
			System.out.println("Hello");
		}//where you put break will dictate what gets printed
	}//outer loop controls number of complete iterations, inner loop is dependent on outer loops
	System.out.println("Good Morning");
}
	}

}
