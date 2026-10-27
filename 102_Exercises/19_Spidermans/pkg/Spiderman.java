package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	public Spiderman(String a){
		age = 0;
		villain = "unknown";
		actor = a;
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	public Spiderman(int A){
		actor = "unknown";
		villain = "unknown";
		age = A;
	}
	// String Actor, int Age constructor! 	Villain Unknown
	public Spiderman(String a, int A){
		actor = a;
		age = A;
	}
	
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(string a, int A, String v){
		actor = a;
		age = A;
		villain = v;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
