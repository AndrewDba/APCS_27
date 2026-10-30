/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	 double balance;
	boolean active;
	int accountNumber;
	
	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
		balance = 0.0;
		active = true;
		accountNumber = (int) (Math.random() * 900 + 100);
	}

	public BankAccount(String n){
		owner = n;
		accountNumber = (int) (Math.random() * 900 + 100);
		balance = 0.0;
		active = true;
	}

	public BankAccount(String n, double b){
		owner = n;
		accountNumber = (int) (Math.random() * 900 + 100);
		balance = b;
		active = true;
	}

	// -------METHODS-------
	public double getBalance(){
		return balance;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String n){
		owner = n;
	}

	public void closeAccount(){
		active = false;
		System.out.println("Account closed for " + owner);
	}
	public boolean isActive(){
		return active;
	}

	public void deposit(double amount){
		if (active) {
			balance = balance + amount;
			System.out.println("Deposited $ " + amount);
		}else{
			System.out.println("Account is closed. Cannot deposit.");
		}

	}
	public void withdraw(double amount){
		System.out.println(owner + " is trying to withdraw $ " + amount);
		if (active){
			if (balance >= amount){
				balance = balance - amount;
			}else{
				System.out.println("Insufficient funds!");
			}
		}else {
			System.out.println("Account is closed!");
		}
	}
	public void checkBalance(){
		System.out.println("Current Account Balance: " + balance);
	}
	public void displayAccountInfo(){
		System.out.println("--- Acout Infp ---");
		System.out.println("Owner: " + owner);
		System.out.println("Balance: $" + balance);
		String status;
		if(active){
			status = "Active";
		}else {
			status = "Closed";
		}
		System.out.println("Status: " + status);
		System.out.println("-----------------------------");
	}
}