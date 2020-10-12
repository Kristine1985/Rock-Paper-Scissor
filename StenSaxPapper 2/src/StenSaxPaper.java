
//importera Scanner 
import java.util.Scanner;

/* This program is a Rock, Paper, Scissor Game
 * **/
public class StenSaxPaper {
	// global variabler for rock, paper and scissor with their respektive values
	final static int rock = 1, paper = 2, scissor = 3;

	// close the Scanner to avoid leaks
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// create scan object for keyboard inputs
		Scanner scan = new Scanner(System.in);

		// Declare variables
		int playerOneScore = 0;
		int playerTwoScore = 0;
		String choice1, choice2;
		int maxGame = 3; // maximum Game
		int gameCounter = 1; // gameCounter

		// Greet the Players
		System.out.println("Welcome to Rock, Paper, Scissor Game!");

		// As long as the counter is less than or equal to Maximum Game the game
		// continues
		while (gameCounter <= maxGame) {

			// Show the game counter
			System.out.println("\nRound " + gameCounter);

			// Get the input from the first player
			System.out.println("Player 1 \n -  Please Choose: Rock, Paper, Scissor \n"
					+ " or  1 for Rock  2 for Paper and 3 for Scissor");

			// transform the first player input to uppercase
			choice1 = scan.nextLine().toUpperCase();

			int val = 57;

			// change the choice1 String variabeln to integer thru parsing
			try {

				val = Integer.parseInt(choice1);
				choice1 = "57";
				

			} catch (NumberFormatException e) {
				if (val == rock) {
					val = rock;

				} else if (val == paper) {
					val = paper;

				} else if (val == scissor) {
					val = scissor;

				}
			}

			// create a multiple nextlines to hide the input of the first player
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));

			// Get the input from the second player
			System.out.println("Player 2 \n- Please Choose: Rock, Paper, Scissor \n "
					+ " or  1 for Rock  2 for Paper and 3 for Scissor ");

			// transform the second player input to uppercase
			choice2 = scan.nextLine().toUpperCase();

			int val2 = 56;

			try {

				val2 = Integer.parseInt(choice2);
				choice2 = "56";
				
				// catch the exception
			} catch (NumberFormatException e) {
				if (val2 == rock) {

					val2 = rock;

				} else if (val2 == paper) {
					val2 = paper;

				} else if (val2 == scissor) {

					val2 = scissor;
				}
			}

			// switch-case statement if the Player 1 and Player 2 type the same String value

			if (choice1.equals(choice2)) {

				switch (choice1) {
				case "ROCK":
					if (choice1.equals(choice2)) {
						System.out.println("It\'s A Tie!");
						System.out.println();
					}
					break;
				case "PAPER":
					if (choice1.equals(choice2)) {
						System.out.println("It\'s A Tie!");
						System.out.println();
					}
					break;
				case "SCISSOR":
					if (choice1.equals(choice2)) {
						System.out.println("It\'s A Tie!");
						System.out.println();
					}
					break;
				default:
					System.out.println("Invalid Input");
					System.out.println();

				}
			}
			// if-else statement checks the player 1 and player 2 type the same integer
			// value
			else if (val == val2) {

				if (val < 1 || val > 3 && val2 < 1 || val2 > 3) {
					System.out.println("Out of Range!");
				} else {
					System.out.println("It\'s A Tie!");
					System.out.println();
				}

			}

			if (choice1.equals("ROCK") && choice2.equals("SCISSOR") || val == rock && val2 == scissor) {
				System.out.println("Player One Wins! ");
				System.out.println();
				playerOneScore++;

			} else if (choice1.equals("SCISSOR") && choice2.equals("ROCK") || val == scissor && val2 == rock) {
				System.out.println("Player Two  Wins!");
				System.out.println();
				playerTwoScore++;

			} else if (choice1.equals("PAPER") && choice2.equals("ROCK") || val == paper && val2 == rock) {
				System.out.println("Player One Wins! ");
				System.out.println();
				playerOneScore++;

			} else if (choice1.equals("ROCK") && choice2.equals("PAPER") || val == rock && val2 == paper) {
				System.out.println("Player Two Wins! ");
				System.out.println();
				playerTwoScore++;

			} else if (choice1.equals("SCISSOR") && choice2.equals("PAPER") || val == scissor && val2 == paper) {
				System.out.println("Player One Wins! ");
				System.out.println();
				playerOneScore++;

			} else if (choice1.equals("PAPER") && choice2.equals("SCISSOR") || val == paper && val2 == scissor) {
				System.out.println("Player Two Wins! ");
				System.out.println();
				playerTwoScore++;
			}
			// gamecounter increments by 1
			gameCounter++;
		}
		// method call to check who wins the game
		checksTheWinner(playerOneScore, playerTwoScore);

	}

	/**
	 * Method whoWins checks who win the game
	 * 
	 * @param playerOneScore is the score of the first player
	 * @param playerTwoScore is the score of the second player
	 */
	static void checksTheWinner(int playerOneScore, int playerTwoScore) {

		if (playerOneScore == playerTwoScore) {
			System.out.println("It\'s a tie for both players!");
		} else if (playerOneScore > playerTwoScore) {
			System.out.println("Congratulations!!!! Player One Wins!");
		} else {
			System.out.println("Congratulations!!!! Player Two Wins!");
		}

	}

}
