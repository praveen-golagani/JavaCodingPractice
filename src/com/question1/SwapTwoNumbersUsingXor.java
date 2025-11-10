package com.question1;

public class SwapTwoNumbersUsingXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
