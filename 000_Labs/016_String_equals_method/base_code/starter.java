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
	
	
	
	
	
	
	
	
	
	
	}
}
