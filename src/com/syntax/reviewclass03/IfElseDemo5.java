package com.syntax.reviewclass03;

public class IfElseDemo5 {

	public static void main(String[] args) {
		int price=10;
		boolean sale=true;
		char gender='F';
		double discount=150;
		double finalPrice=0;
		if (sale) {
			if (gender=='F') {
				if(price>5) {
					finalPrice=finalPrice-finalPrice*discount;
					System.out.println("Line1");
				}
			}
		}else {
			finalPrice=price;
		}//same code above can be shorted and written like below
		if (sale && gender=='F'&& price>5) {
			finalPrice=price-price*discount;
			System.out.println("Line1.2");
		}else {
			finalPrice=price;
			System.out.println("line2");
		}
		// TODO Auto-generated method stub

	}

}
