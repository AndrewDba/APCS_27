/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.println("Write a sentence!");
		String sentence1 = sc.nextLine();

		System.out.println("Write a sentence");
		String sentence2 = sc.nextLine();

		System.out.println("This is using the methods!");
		toStringcombine(sentence1, sentence2);
		}
		public static void toString(String x){
			System.out.println(x);
		}
		
		public static void toStringcombine(String a, String b) {
			System.out.println(a + " " + b);
		}
	
		

		




		
	
}
