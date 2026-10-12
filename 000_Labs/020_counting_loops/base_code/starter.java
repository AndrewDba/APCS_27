/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();

		System.out.println("Please enter how many times you'd like to print your name: ");
		int amount = sc.nextInt();

		for (int i = 0; i < amount; i = i + 1){
			System.out.println(name);
		}


		
	}
}
