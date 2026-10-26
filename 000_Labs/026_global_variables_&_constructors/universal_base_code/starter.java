/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();

		BankAccount Bob = new BankAccount(28746612, "Bob", "Herald", 2.11);
		Bob.banckAccountsToString();

		BankAccount Aston = new BankAccount(91857489, "Aston", "Him", 354.0);
		Aston.banckAccountsToString();

		BankAccount John = new BankAccount(71649673, "John", "Rod", 20.0);
		John.banckAccountsToString();

		BankAccount Eggy = new BankAccount(84760285, "Eggy", "Tim", 50000.0);
		Eggy.banckAccountsToString();
	}
}
