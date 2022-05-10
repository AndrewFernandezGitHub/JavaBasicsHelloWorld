package com.syntax.class12;
//create class properties,fields,attributes
public class PhoneTwo {
String make;
String model;
int noOfCams;
String color;
double screenSize;
String os;
String phoneNumber;
//create behaviors/functions/methods
void makeCall() {
	System.out.println("Making a call");
}
void takePictures() {
	System.out.println("Taking pictures");
}
void printCompleteINfo() {
	System.out.println("make "+make);
	System.out.println("model "+model);
	System.out.println("noOfCams "+noOfCams);
	System.out.println("color "+color);
	System.out.println("screensize "+screenSize);
	System.out.println("phoneNumber "+ phoneNumber);
}
	public static void main(String[] args) {
		PhoneTwo iphone=new PhoneTwo();
		iphone.make="Apple";
		iphone.model="Iphone 13 Pro Max";
		iphone.noOfCams=3;
		iphone.color="blue";
		iphone.screenSize=6.8;
		iphone.os="IOS";
		iphone.phoneNumber="12345678";
		iphone.makeCall();
		iphone.takePictures();
		iphone.printCompleteINfo();
		
		PhoneTwo samsung=new PhoneTwo();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.noOfCams=2;
		samsung.color="red";
		samsung.screenSize=4;
		samsung.os="Batman";
		samsung.phoneNumber="987654321";
		samsung.makeCall();
		samsung.takePictures();
		samsung.printCompleteINfo();
	}

}
