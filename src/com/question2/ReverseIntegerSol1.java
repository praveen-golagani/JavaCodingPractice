package com.question2;

public class ReverseIntegerSol1 {

	public static void main(String[] args) {
		
		int num = -153;
		int revNum = 0;
		int lastDigit;
		while(num!=0) {
			lastDigit = num%10;
			// Check for overflow/underflow before multiplying by 10
            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                System.out.println("Overflow"); // Overflow
                System.exit(0);
            }
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
            	System.out.println("Underflow");
                System.exit(0); // Underflow
            }
			revNum = revNum*10+lastDigit;	
			num = num/10;	
		}
		System.out.println(revNum);
	}

}
