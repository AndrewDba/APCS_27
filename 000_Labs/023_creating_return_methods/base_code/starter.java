/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int a = sc.nextInt();

		System.out.println("What is your exponent number?");
		int b = sc.nextInt();
		System.out.println("Your answer is: " + (pow(a, b)));
	}
		
		
		public static int pow(int c, int d){
			int answer = 1;
			int idk = 0;
			
			while (idk < d){
				answer = answer * c;
				idk = idk + 1;
			}
			return answer;
		}
		
		
	}

