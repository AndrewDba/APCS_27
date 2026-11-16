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

		int size = (int) (Math.random() * 150) + 51;
		int[] arr = new int[size];

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("minimum: " + min);

		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("maximum: " + max);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		double average = (double) sum / arr.length;
		System.out.println("Average: " + average);
		
	}
}
