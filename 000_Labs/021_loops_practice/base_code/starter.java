/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 1000 + 1);
        int guess = 0;

        while (guess != answer) {
            System.out.print("Please guess a number: ");
            guess = sc.nextInt();

            if (guess < answer) {
                System.out.println("The number is higher.");
            } else if (guess > answer) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("Correct!");
            }
        }


		
	}
}
