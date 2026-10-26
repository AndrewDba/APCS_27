/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	 String name;
	 double balance;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		name = "unknown";
		balance = 0.0;
	}

	public BankAccount(String n){
		name = n;
		balance = 0.0;
	}

	public BankAccount(String n, double b){
		name = n;
		balance = b;
	}

	// -------METHODS-------
	public double getBalance(){
		return balance;
	}

	public void displayAccountInfo(){
		System.out.println("Owner: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Status: Active");
		System.out.println("-----------------------------");
	}
}