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

		System.out.println("write down a number: ");
		int x = sc.nextInt();

		System.out.println("write down another number: ");
		int y = sc.nextInt();
		boolean answer = x < y;
		if (answer) {
			System.out.print("the numbers are ");
		}

	
	}
}
