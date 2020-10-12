
//importera Scanner 
import java.util.Scanner;

/* This program is a Rock, Paper, Scissor Game
 * **/
public class StenSaxPaper {
	// global variabler for rock, paper and scissor with their respektive values
	final static int rock = 1, paper = 2, scissor = 3;
	static int playerOneScore = 0;
	static int playerTwoScore = 0;

	// close the Scanner to avoid leaks
	@SuppressWarnings("resource")

	public static void printInfo(String player) {
		System.out.println(player + " \n- Please Choose: Rock, Paper, Scissor \n "
				+ " or  1 for Rock  2 for Paper and 3 for Scissor ");
	}
	
	public static void playerOneWins() {
		System.out.println("Player One Wins! \n\n");
		playerOneScore++;
	}
	public static void playerTwoWins() {
		System.out.println("Player Two Wins! \n\n");
		playerTwoScore++;
	}
	public static void itsTie() {
		System.out.println("It\'s A Tie! \n\n");
	}
	public static void main(String[] args) {

		// create scan object for keyboard inputs
		Scanner scan = new Scanner(System.in);

		// Declare variables
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
			printInfo("Player 1");

			// transform the first player input to uppercase
			choice1 = scan.nextLine().toUpperCase();


			int val = 57;
			
			

			// change the choice1 String variabeln to integer thru parsing
			try {

				val = Integer.parseInt(choice1);
				if (val == rock) {
					choice1 = "ROCK";
				} else if (val == paper) {
					choice1 = "PAPER";
				} else if (val == scissor) {
					choice1 = "SCISSOR";
				} else {
					if (val < 1 || val > 3) {
						System.out.println("Out of Range!");
						continue;
					}
				}

			} catch (NumberFormatException e) {
				if (!(choice1.equals("ROCK")) && !(choice1.equals("PAPER")) && !(choice1.equals("SCISSOR"))) {
					System.out.println("Wrong input!");
					continue;
				}
				
			}

			// create a multiple nextlines to hide the input of the first player
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));

			// Get the input from the second player
			printInfo("Player 2");

			// transform the second player input to uppercase
			choice2 = scan.nextLine().toUpperCase();

			int val2 = 56;

			try {

				val2 = Integer.parseInt(choice2);
				if (val2 == rock) {
					choice2 = "ROCK";
				} else if (val2 == paper) {
					choice2 = "PAPER";
				} else if (val2 == scissor) {
					choice2 = "SCISSOR";
				} else {
					if (val2 < 1 || val2 > 3) {
						System.out.println("Out of Range!");
						continue;
					}
				}

				// catch the exception
			} catch (NumberFormatException e) {
				if (!(choice2.equals("ROCK")) && !(choice2.equals("PAPER")) && !(choice2.equals("SCISSOR"))) {
					System.out.println("Wrong input!");
					continue;
				}
				
			}

			// switch-case statement if the Player 1 and Player 2 type the same String value

			if (choice1.equals(choice2)) {
						itsTie();
				}
			
				
				try {

				//	int choicePlayer1 = Integer.valueOf(playerOneScore);
				//	int choicePlayer2 = Integer.valueOf(playerOneScore);

					//if (choicePlayer1 > 0 && choicePlayer1 < 4 && choicePlayer2 > 0 && choicePlayer2 < 4)

						if (choice1.equals("ROCK") && choice2.equals("SCISSOR") || val == rock && val2 == scissor) {
							playerOneWins();

						} else if (choice1.equals("SCISSOR") && choice2.equals("ROCK")
								|| val == scissor && val2 == rock) {
							playerTwoWins();

						} else if (choice1.equals("PAPER") && choice2.equals("ROCK") || val == paper && val2 == rock) {
							playerOneWins();

						} else if (choice1.equals("ROCK") && choice2.equals("PAPER") || val == rock && val2 == paper) {
							playerTwoWins();

						} else if (choice1.equals("SCISSOR") && choice2.equals("PAPER")
								|| val == scissor && val2 == paper) {
							playerOneWins();

						} else if (choice1.equals("PAPER") && choice2.equals("SCISSOR")
								|| val == paper && val2 == scissor) {
							playerTwoWins();
						}

					// gamecounter increments by 1
					gameCounter++;

				} catch (Exception e) {
					System.out.println("error type: " + e);
				}

			}
			checksTheWinner.check(playerOneScore, playerTwoScore);
		}
	}

