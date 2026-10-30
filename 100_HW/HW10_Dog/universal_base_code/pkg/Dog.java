package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
		private String name;
		private int age;
		private String breed;
	


		public Dog(){
			name = "Clifford";
			age = 3;
			breed = "big red dog";
		}


		public Dog(String n) {
		name = n;
		age = 1;
		breed = "dog dog";
		}


		public Dog(String n, String b) {
		name = n;
		age = 1;
		breed = b;
		}


		public Dog(String n, int a) {
		name = n;
		age = a;
		breed = "dog dog";
		}

		
		public void setName(String input) {
		name = input;
		}

		public void setAge(int input) {
		age = input;
		}

		public void setBreed(String input) {
		breed = input;
		}

		public String getName() {
		return name;
		}

		public int getAge() {
		return age;
		}

		public String getBreed() {
		return breed;
		}

		public boolean isSleeping() {
		int randomNum = (int) (Math.random() * 2);
		return randomNum == 1;
		}

		public void bark() {
		System.out.println(name + " Barks");















	}

}
