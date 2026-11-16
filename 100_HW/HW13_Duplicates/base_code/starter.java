/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[20];

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) (Math.random() * 10) * 1;
		}
		System.out.println("These are the 20 numbers");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("--------------------------------------------");

		int targetNum = (int)(Math.random() * 10) + 1;
		System.out.println("The random number to look for is " + targetNum);

		int duplicate = 0;
		for(int i = 0; i < arr.length; i++){
			if  (arr[i] == targetNum){
				System.out.println("Duplicate found at index " + i);
				duplicate = duplicate + 1;
			}
		}
			System.out.println("Total number of duplicates for " + targetNum + " is " + duplicate);
			System.out.println("------------------------------------------------");
			
			System.out.println("Looking for two in a row ");
			int consecutive = 0;
			for(int i = 0; i < arr.length - 1; i++){
				if(arr[i] == arr[i + 1]){
					System.out.println("Two in a row found at index " + i + " and " + (i + 1) + ". The number is " + arr[i]);
					consecutive++;
				}

				
			}
			if(consecutive == 0){
				System.out.println("No two consecutive numbers found in this run");

			}
			System.out.println("------------------------------------");
	}
}
