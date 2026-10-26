/*
 *	Author:  
 *  Date: 
*/
import java.util.Random;
import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BankAccount x = new BankAccount();
		
		int accountNumber = (int) (Math.random() * 300) + 100;

		System.out.println("Welcome to the Poole ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int oneTwoOrThree = sc.nextInt();
		

		if (oneTwoOrThree == 1) {
			 x = new BankAccount();

		}else if(oneTwoOrThree == 2){
			System.out.println("What is the name of the owner of this bank account?");
			String name = sc.nextLine();
			sc.nextLine();
			 x = new BankAccount(name);



		}else if(oneTwoOrThree == 3){
			System.out.println("What is the name of the owner of this bank account?");
			String name = sc.nextLine();
			System.out.println("How much are you initially deositing into this account?");
			double balance = sc.nextDouble();
			x = new BankAccount(name, balance);
		}

		System.out.println("--- Account Info ---");
		System.out.println("Account Number; " + accountNumber);
		x.displayAccountInfo();

		System.out.println("Would you like to check your balance of this account? (yes/no)");
		sc.nextLine();
		String choice = sc.nextLine();

		if (choice.equalsIgnoreCase("yes")){
			System.out.println("Current Account Balance: " + x.getBalance());
		} else {
			System.out.println("Great! No balance checked.");
		}
			
		System.out.println("Thank you for coming the the Poole ATM!");
		
	}
}
