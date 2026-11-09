/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Boolean primeOrNot;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int input = sc.nextInt();

		printPrimes(input);
		}

		public static boolean checkPrime(int a){
			if (a < 2){
				return false;
			}
			int i = 2;
			while(i < a){
				if (a % i == 0){
					return false;
				}
				i = i + 1;
			}
			return true;
		}
		
		public static void printPrimes(int b){
			int i = 2;
			while (i < b){
				if (checkPrime(i)){
					System.out.println(i);
				}
				i = i + 1;
			}
		}
}
