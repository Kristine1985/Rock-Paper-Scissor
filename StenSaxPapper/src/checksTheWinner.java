
public class checksTheWinner {
	
	public static void check(int playerOneScore, int playerTwoScore) {

		// method call to check who wins the game
				
				if (playerOneScore == playerTwoScore) {
					System.out.println("It\'s a tie for both players!");
				} else if (playerOneScore > playerTwoScore) {
					System.out.println("Congratulations!!!! Player One Wins!");
				} else {
					System.out.println("Congratulations!!!! Player Two Wins!");
				}
			}
		}



