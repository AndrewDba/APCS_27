/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String response = sc.nextLine();

            if (response.equals("done")){
                System.out.println("Thanks for playing!");
                break;
            }else if(response.equals("yes")){
                String playerChoice = "";
                while (true){
                    System.out.println("Please enter rock/paper/scissors:");
                    playerChoice = sc.nextLine();
                    if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")){
                        break;
                    }
                }
            
            String computerChoice = getObject();
            int result = compare2(playerChoice, computerChoice);

            if (result == 0) {
                System.out.println("You tied!");
            }else if(result == 1){
                System.out.println("You won!!!");
        }else {
            System.out.println("The computer won!");
        }
    }
    else if(response.equals("no")){
        System.out.println("How many times would you like the computer to play itself?");
        int numGames = sc.nextInt();
        sc.nextLine();

        int p1Wins = 0;
        int p2Wins = 0;
        int ties = 0;

        int i = 0;
        while (i < numGames){
            String p1 = getObject();
            String p2 = getObject();
            int res = compare2(p1, p2);

            if (res == 0){
                ties = ties + 1;
            }else if( res == 1){
                p1Wins = p1Wins + 1;
            }else {
                p2Wins = p2Wins + 1;
            }
            i = i + 1;
        }
        System.out.println("Player 1 wins: " + p1Wins);
        System.out.println("Player 2 win: " + p2Wins);
        System.out.println("Ties: " + ties);
    }
        }
    }
    public static String getObject(){
        int randomNum = (int) (Math.random() * 3);
        if (randomNum == 0){
            return "rock";
        }else if (randomNum == 1){
            return "paper";
        }else {
            return "scissors";
        }

    }

    public static int compare2(String p1, String p2){
        if (p1.equals(p2)){
            return 0;
        }

        if ((p1.equals("rock") && p2.equals("scissors")) || (p1.equals("paper") && p2.equals("roock")) || (p1.equals("scissors") && p2.equals("paper"))){
            return 1;
        
     
        }
        return 2;
    }

    
}
    