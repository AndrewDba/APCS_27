/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");

		System.out.print("Please enter an integer: ");
		int integer1 = sc.nextInt();
		System.out.print("Please enter anoter integer (bigger than the first one ): ");
		int integer2 = sc.nextInt();
		System.out.println();
		System.out.println("Your range is " + integer1 + " to " + integer2);
		System.out.println("Here are 5 numbers generated in that range");
		int numb1 = (int) (Math.random() * (integer2 - integer1) + integer1);
		int numb2 = (int) (Math.random() * (integer2 - integer1) + integer1);
		int numb3 = (int) (Math.random() * (integer2 - integer1) + integer1);
		int numb4 = (int) (Math.random() * (integer2 - integer1) + integer1);
		int numb5 = (int) (Math.random() * (integer2 - integer1) + integer1);
		System.out.print(numb1 + ", " + numb2 + ", " + numb3 + ", " + numb4 + ", " + numb5);
	}
}
