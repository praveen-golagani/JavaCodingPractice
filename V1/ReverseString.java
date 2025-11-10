package V1;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine().trim(); // trim removes leading/trailing spaces
		if(input.isEmpty()) {
			System.out.println("Input cannot be empty - Please enter a valid string.");
		}else {
		System.out.println("For loop : "+reverseUsingForLoop(input));
		System.out.println("SBuilder : "+reverseUsingSBuilder(input));
		}
		sc.close();
	}
	
	// using for loop
	public static String reverseUsingForLoop(String inp) {
		String rev = "";
		for(int i = inp.length()-1;i>=0;i--) {
			rev+=inp.charAt(i);
		}
		return rev;
	}
	// using string builder
	public static String reverseUsingSBuilder(String inp) {
		return new StringBuilder(inp).reverse().toString();
	}

}
