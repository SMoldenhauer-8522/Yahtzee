/* 
Class: CS-358 Software Engineering Principles
Proffessor: Jocelyn Richardt
Assignment: Programming Assesment 1: Yahtzee
*/

// Class imports
import java.util.Scanner;

// Yahtzee class
public class Yahtzee {

    // This being a function is not currently needed given how simple it is. This allows for the simple ability to gather more user info in the future.
    public static int GetPlayerInfo() {
        int numOfPlayers =1;
        String confirmation = "n";
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many people will be playing? (1-6)");
        numOfPlayers = userInput.nextInt();  

        userInput.close();
        return numOfPlayers;
    }
    // Main Function
    public static void main(String[] args) {
        int players = GetPlayerInfo();

        System.out.println(players + " people are playing Yahtzee!");
    }
}