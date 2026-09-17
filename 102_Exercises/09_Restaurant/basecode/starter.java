/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================================");
		System.out.println("         WELCOME RESTAURANT OWNER!");
		System.out.println("============================================");
		
		System.out.println("What's the name of your restaurant?");
		String restName = sc.nextLine(); 
		System.out.println();
		
		
		System.out.println("What's your name? ");
		String myName = sc.nextLine(); 
		System.out.println();

		System.out.println("Great to see you, " + myName + "! Let's set up a menu for " + restName + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");

		System.out.println("--- Item #1 ---");
		System.out.println("Item name:"); 
		String item1 = sc.nextLine();
		System.out.println("Price of " + item1 + "($):");
		double itemPrice1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("How many " + item1 + " would you like?");
		int itemAmount1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + itemAmount1 + "x " + item1 + " to your order! " + "$" + (itemPrice1 * itemAmount1));
		
		System.out.println("--- Item #2 ---");
		System.out.println("Item name:"); 
		String item2 = sc.nextLine();
		System.out.println("Price of " + item2 + "($):");
		double itemPrice2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("How many " + item2 + " would you like?");
		int itemAmount2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + itemAmount2 + "x " + item2 + " to your order! " + "$" + (itemPrice2 * itemAmount2));


		System.out.println("--- Item #3 ---");
		System.out.println("Item name:"); 
		String item3 = sc.nextLine();
		System.out.println("Price of " + item3 + "($):");
		double itemPrice3 = sc.nextDouble();
		sc.nextLine();
		System.out.println("How many " + item3 + " would you like?");
		int itemAmount3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + itemAmount3 + "x " + item3 + " to your order! " + "$" + (itemPrice3 * itemAmount3));

		System.out.println("Nice choices! What tip percentage would you live to leave? 10, 15, or 20:");
		double tip = sc.nextDouble();
		
		System.out.println();
		System.out.println("======================================");
		System.out.println("        " + restName + " - Menu For Today");
		System.out.println("======================================");
		System.out.println("Owner: " + myName);
		System.out.println("--------------------------------------");
		System.out.println("Item         Gty    Price");
		System.out.println("--------------------------------------");
		System.out.println(item1 + "          " + itemAmount1 + "    " + itemPrice1 * itemAmount1);
		System.out.println(item2 + "         " + itemAmount2 + "   " + itemPrice2 * itemAmount2);
		System.out.println(item3 + "        " + itemAmount3 + "   " + itemPrice3 * itemAmount3);
		System.out.println("--------------------------------------");
		
		double subtotal = (itemAmount1 * itemPrice1) + (itemAmount2 * itemPrice2) + (itemAmount3 * itemPrice3);
        System.out.println("Subtotal:                " + subtotal);
        double tipdeci = tip * 0.01;
        double tipsub = subtotal * tipdeci;
        System.out.println("Tip (" + tip + "%):          " + tipsub);
        double taxsub = (0.01 * 9.75) * subtotal;
        System.out.println("Tax (9.75%):           " + taxsub);
        System.out.println("=================================================");
        System.out.println("TOTAL:                 $"  + (tipsub + taxsub));
        System.out.print("=================================================");
	
	
	}
}
