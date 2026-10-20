/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		// Write your code here!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Type Quest!");
		System.out.println("It is currently " + getTime() + " PM and we're ready to play!");
		System.out.println("Given a sentence, type it as fast as possible!");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Woud you like to:");
		System.out.println("1 - Play random");
		System.out.println("2 - Play set");
		System.out.println("3 - Quit");
		int options3 = sc.nextInt();
		

		
			if (options3 == 1) {
			System.out.println("Youve chosen to randomly select a sentence.");
			System.out.println("-------------Your sentence is:------------");
			String sentence = getSentence();
			System.out.println(sentence);
			System.out.println("------------------------------------------");
			countdown();
			sc.nextLine();

			startTimer();
			String answerToSentence = sc.nextLine();
			double timeElapsed = endTimer();
			int errors = compareSentences(sentence, answerToSentence);
			int totalLetters = sentence.length();
			int totalWords = wordsInSentence(sentence);

			double lettersPerMinute = (totalLetters / timeElapsed) * 60;
			double wordsPerMinute = (totalWords / timeElapsed) * 60;
			System.out.println("Nice job! Here is your result!");
			System.out.println("Time: " +timeElapsed);
			System.out.println("Errors: " + errors + " / " + totalLetters + "letters");
			System.out.println(lettersPerMinute + " letters per minute");
			System.out.println("-------------------------------------------------------");
		} else if (options3 == 2) {
			
			System.out.println("-------------Your sentence is:------------");
			String sentence2 = getSentence();
			System.out.println(sentence2);
			System.out.println("------------------------------------------");
			countdown();
			sc.nextLine();

			startTimer();
			String answerToSentence2 = sc.nextLine();

			double timeElapsed2 = endTimer();

			int errors2 = compareSentences(sentence2, answerToSentence2);
			int totalLetters2 = sentence2.length();
			int totalWords2 = wordsInSentence(sentence2);

			double lettersPerMinute2 = (totalLetters2 / timeElapsed2) * 60;
			double wordsPerMinute2 = (totalWords2 / timeElapsed2) * 60;

			System.out.println("Nice job! Here is your result!");
			System.out.println("Time: " + timeElapsed2);
			System.out.println("Errors: " + errors2 + " / " + totalLetters2 + "letters");
			System.out.println(lettersPerMinute2 + " letters per minute");
			System.out.println("-------------------------------------------------------");
			
		}

		
		
		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
