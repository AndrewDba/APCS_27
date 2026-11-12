/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		int[] numbers = new int[1000];
		
		for(int i = 0; i < numbers.length; i = i + 1){
			numbers[i] = (int) (Math.random() * 100);
		}

		for(int a = 0; a < numbers.length; a = a + 1){
			System.out.println(numbers[a]);
		}
		
	}
}
