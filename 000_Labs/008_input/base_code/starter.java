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
		String name = sc.nextLine();

		
		System.out.println("What is your age");
		int age = sc.nextInt();
		
		
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();

        
		System.out.println("What day were you born? (1-31)");
        int day = sc.nextInt();

		
		System.out.println("What year were you born? (1-12)");
		int year = sc.nextInt();
		
		
		System.out.println("How much is a buck fifty? (0.0)");
		double buckfity = sc.nextDouble();

		System.out.println("Your name is " + name + " and you were born on " + month + "/" + day + "/" + year);
		System.out.println("You are " + age + "years old!!");
		System.out.println("you have $" + buckfity + " in your wallet.");
		int MyNumber = 5;
		

}
}
