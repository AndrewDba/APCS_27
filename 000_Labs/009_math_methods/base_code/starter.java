/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a double: "); 
		double x = sc.nextDouble();
		

		System.out.print("Please enter another double: ");
		double y = sc.nextDouble();
		
		
		System.out.println("Maximum nymber of x and y is: " + Math.max(x,y));
		System.out.println("Square root of y is: " + Math.sqrt(y));
		System.out.println("Power of x and y is: " + Math.pow(x,y));
	
	
		
	
	
	
	}
}
