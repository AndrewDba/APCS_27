/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman a = new Spiderman();
		Spiderman b = new Spiderman("Toby Maguire", 48, "Green Goblin");
		Spiderman c = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman d = new Spiderman("Tom Holland", 27, "The Vulture");

		a.setActor("Peter Grifin");
		a.setAge(64);
		a.setVillain("Lois");


	
		System.out.println(a.getActor());
		System.out.println(a.getAge());
		System.out.println(a.getVillain());
		System.out.println("--------------------");
		System.out.println(b.getActor());
		System.out.println(b.getAge());
		System.out.println(b.getVillain());
		System.out.println("---------------------");
		System.out.println(c.getActor());
		System.out.println(c.getAge());
		System.out.println(c.getVillain());
		System.out.println("---------------------");
		System.out.println(d.getActor());
		System.out.println(d.getAge());
		System.out.println(d.getVillain());

		
		
	}
}
