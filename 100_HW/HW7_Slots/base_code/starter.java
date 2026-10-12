/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Each player starts with $100"); 
		System.out.println("2. Input a wager ess than your total amount of money"); 
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10"); 
		System.out.println("a. If two numbers match, you double your money."); 
		System.out.println("b. If three numbers atch, you triple your money."); 
		System.out.println("c. If none match, you lose your money."); 
		System.out.println("-------------------------------------------------------"); 

		int money = 100;
		String answer = "yes";
		
		
		while (money > 0 && (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))) {

		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			answer = sc.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {

			System.out.println("You have $" + money + ". How much would you like to wager?");
			int wager = sc.nextInt();
		sc.nextLine();

		if (wager <= 0 || wager > money) {
		System.out.println("Invalid wager!");
		
		}

			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			System.out.println("------------------");

		int firstOne = (int) (Math.random() * 10 + 1);
		int secondOne = (int) (Math.random() * 10 + 1);
		int thirdOne = (int) (Math.random() * 10 + 1);

		System.out.println("| " + firstOne + " | " + secondOne + " | " + thirdOne + " |");

		if (firstOne == secondOne && secondOne == thirdOne) {
			System.out.println("JACKPOT! You triple your wager!");

			money = money * wager * 2;	
		}else if (firstOne == secondOne || firstOne == thirdOne || secondOne == thirdOne) {
			System.out.println("Two numbers match! You double your wager!");
			money = money + wager;
		} else {
		System.out.println("------------------");
		System.out.println("Didn't win this time, better luck next time!");
		money = money - wager;
	}

		System.out.println("You now have $" + money);

		} else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
			System.out.println("Sad to see you go! You still have $" + money + ". Come again soon! Thanks!");
			break;
		} 
	}

	if (money <= 0) {
	System.out.println("---------------------------------------------------------------");
	System.out.println("");
	System.out.println("You've ran out of money! Thanks for coming! Come back soon!");
	}

	
}
}

