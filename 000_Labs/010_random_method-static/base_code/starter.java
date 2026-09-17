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
		int between09 = (int) (Math.random() * 9);
		System.out.println("A number between 0 - 9: " + between09); 
	
		int between110 = (int) (Math.random() * 10 + 1);
		System.out.println("A number between 1 - 10: " + between110);
	
		double between2535 = (double) (Math.random() * 1 + 2.5);
		System.out.println("A number between 2.5 and 3.5: " + between2535);
	
		double between14589 = (double) (Math.random() * 589 + 14);
		System.out.println("A number between 14 and 589: " + between14589);
	
	
	
	}
}
