/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a double: "); 
		int number1 = sc.nextInt();
		

		System.out.print("Please enter another double: ");
		int number2 = sc.nextInt();
	
		if (number1 % 2 == 0) {
		System.out.println(number1 + " is divisible by 2!");
		} else {
			System.out.println(number1 + " is not divisible by 2!");
		}
	
		if (number1 % 3 == 0 && number1 % 4 == 0 && number1 % 5 == 0) {
		System.out.println(number1 + " is divisible by 3, 4, and 5!");
		} else {
			System.out.println(number1 + " is not divisible by 3, 4, or 5!");
		}
	
	
	
		if (number2 % 2 == 0) {
		System.out.println(number2 + " is divisible by 2!");
		} else {
			System.out.println(number2 + " is not divisible by 2!");
		}
	
		if (number2 % 3 == 0 && number2 % 4 == 0 && number2 % 5 == 0) {
		System.out.println(number2 + " is divisible by 3, 4, and 5!");
		} else {
			System.out.println(number2 + " is not divisible by 3, 4, or 5!");
		}
	
	
	
	
	
	
	}
}
