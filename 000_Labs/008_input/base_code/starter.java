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
	    
		
		System.out.println("What is your first name");
		
		String age = sc.nextLine();
		System.out.println("What is your age");
		
		String month = sc.nextLine();
		System.out.println("What month were you born? (1-12)");
		
        String day = sc.nextLine();
		System.out.println("What day were you born? (1-31)");
        

		String year = sc.nextLine();
		System.out.println("What year were you born? (1-12)");

		String buckfity = sc.nextLine();
		System.out.println("How much is a buck fifty? (0.0)");

	}
}
