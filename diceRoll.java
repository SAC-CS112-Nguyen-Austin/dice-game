import java.util.Scanner;

public class diceRoll {
	
	public static void main(String[] args) {
		Scanner  input = new Scanner (System.in);
		
		while(true) {
		System.out.println( "Would you like to play? Enter 1 for yes, 2 for no. ");
		int userPlay = input.nextInt();
		
		if (userPlay < 1 || userPlay > 2) {
			System.out.println("Invalid input. ");
		}
		else if (userPlay == 2) {
			break;
		}
		
		// ask user for how many die
		System.out.println("How many die do you need? " );
		
		int userNumOfDie;
		while (true) {
			userNumOfDie = input.nextInt();
		
			if (userNumOfDie >= 1) {
				break;
			}
		
		}
		
		// Array for Match History
		int numOfThrows = 0;
		int numOfSuccess = 0;
		int numOfLoss = 0;
		
		int [] matchHistory = new int [3];
		
		// Ask user to guess points
		System.out.println("Guess how many points was rolled? ");
		int userGuess = input.nextInt();
		
		// Add number of throws
		
		++numOfThrows;
		
		// Compare the computer guess to user guess
		die object = new die();
		int dieValue = object.rollDie(userNumOfDie);
		
		System.out.println("The computer rolls: " + dieValue);
		System.out.println("Your Guess: " + userGuess);
		
		if (userGuess == dieValue) {
			++numOfSuccess;
		}
		else if (userGuess != dieValue) {
			++numOfLoss;
		}
		
		float winPercent = numOfSuccess * 100 / numOfThrows;
		float losePercent = 100 - winPercent;
		
		// Give scores
		
		System.out.println("You have played " + numOfThrows + " games");
		System.out.println("You won a total of " + numOfSuccess + " games");
		System.out.println("You have lost a total of " + numOfLoss + " games");
		System.out.println("Your win percetange is: " +winPercent);
		System.out.println("Your loss percetange is: " +losePercent);
	}
	}

}
