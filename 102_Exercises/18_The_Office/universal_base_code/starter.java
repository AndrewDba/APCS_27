/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		

		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();

		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();

		Employee Patric = new Employee(2112, "Patric", "Egg", 5000);
		Patric.employeeToString();

		System.out.println("Here is Dwights annual salary!");
		System.out.println(Dwight.getAnnualSalary());

		System.out.println("Here is Jims annual salary!");
		System.out.println(Jim.getAnnualSalary());

		System.out.println("Here is Pams annual salary!");
		System.out.println(Pam.getAnnualSalary());

		System.out.println("Here is Patrics annual salary!");
		System.out.println(Patric.getAnnualSalary());

		Dwight.raiseSalary(50);
		Jim.raiseSalary(30);
		Pam.raiseSalary(15);
		Patric.raiseSalary(70);


		System.out.println("");
		System.out.println("Dwight Im raising your salary by 50 percent enjoy!");
		System.out.println(Dwight.getSalary());

		System.out.println("Jimt Im raising your salary by 30 percent enjoy!");
		System.out.println(Jim.getSalary());

		System.out.println("Dwight Im raising your salary by 15 percent enjoy!");
		System.out.println(Pam.getSalary());

		System.out.println("Patric Im raising your salary by 70 percent enjoy!");
		System.out.println(Patric.getSalary());




	
	}
}
