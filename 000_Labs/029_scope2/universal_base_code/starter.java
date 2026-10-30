/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String statement = "";
		if(shrek.isUgly()){
			statement = new String(shrek.getName() + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		int i = 0;
		while(i < 5){
			shrek.interact(donkey);
			i = i + 1;
		}
		System.out.println("That printed out " + i + " times");

	}
}
