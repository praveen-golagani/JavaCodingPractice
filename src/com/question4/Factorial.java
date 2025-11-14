package com.question4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int fact = 1;
		for(int i=number;i>0;i--) {
			fact *= i;
		}
		System.out.println("Factorial : "+fact);
		sc.close();

	}

}
