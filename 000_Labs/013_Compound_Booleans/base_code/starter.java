/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter your first number: " );
		int firstNum = sc.nextInt();
		
		System.out.print("Please enter your second number: " );
		int secondNum = sc.nextInt();

		System.out.print("Please enter your third number: " );
		int thirdNum = sc.nextInt();
		System.out.println();

		if (firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " + firstNum);
		}
	
		if (secondNum > firstNum && secondNum > thirdNum) {
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was " + secondNum);
		}
		
		if (thirdNum > firstNum && thirdNum > secondNum) {
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " + thirdNum);
		}
	
		if (firstNum < secondNum && firstNum < thirdNum) {
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was " + firstNum);
		}
	
		if (secondNum < firstNum && secondNum < thirdNum) {
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + secondNum);
		}
		
		if (thirdNum < firstNum && thirdNum < secondNum) {
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was " + thirdNum);
		}
	
	
	
	}
}
