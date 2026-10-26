/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	int bankAccountID;	
	String firstName;
	String lastName;
	double balance;	

	// -------CONSTRUCTORS-------
	public BankAccount() {
		bankAccountID = 12345678; //used as an example or placeholder
		firstName = new String("Peter");
		lastName = new String("Griffin");
		balance = 20.0;
	}

	public BankAccount(int i, String fn, String ln, double s){
		bankAccountID = i;	
		firstName = fn;
		lastName = ln;
		balance = s;
	}

	// -------METHODS-------

	public int getbankaccountID(){
		return bankAccountID;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){			// Returns Last name of the Employee
		return lastName;
	}

	public void banckAccountsToString(){						
		System.out.println("------------------------------");
		System.out.println("Bank account id: " + bankAccountID);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("balance: " + balance);
		System.out.println("------------------------------");
		System.out.println("");
	}

}