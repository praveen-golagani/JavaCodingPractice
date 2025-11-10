package com.question1;

public class SwapOfTwoNumberSol1 {

	public static void main(String[] args) {
		// using temp (third) var
		
		int a = 10;
		int b = 20;
		System.out.println("Before swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		

	}

}
