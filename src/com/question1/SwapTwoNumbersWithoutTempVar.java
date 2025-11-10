package com.question1;

public class SwapTwoNumbersWithoutTempVar {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
//		b = a+b;
//		a = b-a;
//		b = b-a;
		a = (a+b)-(b=a);
		System.out.println("After swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
