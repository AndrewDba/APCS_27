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
		
		System.out.println("The goal of the game is to guess a word with two hints!");

		int randomNum = (int) (Math.random() * 3 + 1);
		String planet = "";
		String planet2 = "";
		
		
		String dog = "";
		String dog2 = "";
		
		String apple = "";
		String apple2 = "";

		if (randomNum == 1) {
		System.out.println("Its a planet in our solar system! ");
		System.out.print("What is your guess? ");
		planet = sc.nextLine();
		System.out.println();
		
		if (planet.equalsIgnoreCase("mars")) {
        System.out.println("You got it! Woo!");
   		 } else {
        System.out.println("You sadly didn't guess right. Here's another hint! ");
		 System.out.println("Its the only one that used to have water on it! ");
		planet2 = sc.nextLine();
			
		if (planet2.equalsIgnoreCase("mars"))  {
			System.out.println("you got it! Woo!");
		}
			
		}
		}	 
	
	if (randomNum == 2) {
		System.out.println("It has paws ");
		System.out.print("What is your guess? ");
		dog = sc.nextLine();
		System.out.println();
		
		if (dog.equalsIgnoreCase("dog")) {
        System.out.println("You got it! Woo!");
   		 } else {
        System.out.println("You sadly didn't guess right. Here's another hint! ");
		 System.out.println("There are THOUSANDS of breeds and mixes of breeds! ");
		dog2 = sc.nextLine();
			
		if (dog2.equalsIgnoreCase("dog"))  {
			System.out.println("you got it! Woo!");
		}
			
		}
		}	 
	
	if (randomNum == 3) {
		System.out.println("Its a fruit ");
		System.out.print("What is your guess? ");
		apple = sc.nextLine();
		System.out.println();
		
		if (apple.equalsIgnoreCase("apple")) {
        System.out.println("You got it! Woo!");
   		 } else {
        System.out.println("You sadly didn't guess right. Here's another hint! ");
		 System.out.println("Its grows on trees and its red ");
		apple2 = sc.nextLine();
			
		if (apple2.equalsIgnoreCase("apple"))  {
			System.out.println("you got it! Woo!");
		}
			
		}
		}	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}








