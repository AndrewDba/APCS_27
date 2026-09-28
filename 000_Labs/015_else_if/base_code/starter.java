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
		Scanner sc = new Scanner(System.in);

		System.out.print("Pick a number between 1 - 1000: "); 
		int num1Thro1Thousand = sc.nextInt();
		
		int randomNum = (int) (Math.random() * 1000 + 1);
		
		
			 if (randomNum > num1Thro1Thousand) {
            System.out.println("Your number was smaller than the number. The number was " + randomNum);
        	} else if (randomNum < num1Thro1Thousand) {
            System.out.println("Your number was larger than the number. The number was " + randomNum);
        	}
		
}
}