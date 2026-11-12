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
		
		int i = 0;
		while(i < numbers.length){
			numbers[i] = (int) (Math.random() * 100);
			i = i + 1;
		}
		int a = 0;
		while(a < numbers.length){
			System.out.println(numbers[a]);
			a = a + 1;
		}


		
	}
}
