package com.tessa.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		Galaxy s21 = new Galaxy("S21", 100, "Sprint", "boop boop");
		IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");
		IPhone iphone12 = new IPhone("12", 100, "AT&T", "beep bop");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
		
		//-------------------------------------------------------------
		
		System.out.println("----------my iphone sample--------------");
		
		iphone12.displayInfo();
		System.out.println(iphone12.ring());
		System.out.println(iphone12.unlock());
		
		System.out.println("----------my Galaxy sample--------------");
		
		s21.displayInfo();
		System.out.println(s21.ring());
		System.out.println(s21.unlock());
	}

}
