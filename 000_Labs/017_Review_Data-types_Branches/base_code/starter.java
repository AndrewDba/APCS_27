/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?"); 
		String name = sc.nextLine();

		System.out.println("What is your title? EX: Slayer of dragons");
		String title = sc.nextLine();

		int rogue = (int) (Math.random() + 1);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String WWorR = sc.nextLine();
		if (WWorR.equals("Warrior") || WWorR.equals("warrior")) {
			System.out.println("You've chosen the Warior! For honor!");
		}else if (WWorR.equals("Wizard") || WWorR.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}else if (WWorR.equals("Rogue") || WWorR.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}else if (rogue == 1){
			System.out.println("You've decided not to chose a role. Return program");
		}
	
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and charisma. Spend them wisely.");
		int points = 20;
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		points = points - strength;
		System.out.println("you have " + points + " left to spend.");
		
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		points = points - Dexterity;
		System.out.println("you have " + points + " left to spend.");

		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		points = points - intelligence;
		System.out.println("you have " + points + " left to spend.");


		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		points = points - charisma;
		System.out.println("--------------------------------------");
		System.out.println("You are" + name + ", " + title + " of CVHS.");
		System.out.println("You're a " + WWorR + " with the following statsQ");
		System.out.println("strenght - " + strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("Good luck on your quest " + name + "!");
		
		
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
