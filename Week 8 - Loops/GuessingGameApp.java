

import java.util.Scanner;

public class GuessingGameApp{
	public static void main(String args[]){

		int guess, secretNumber;
		String result, keepPlaying;

		keepPlaying = "y";

		Scanner userInput = new Scanner(System.in);
		GuessingGame myApp = new GuessingGame();


		while (keepPlaying.equalsIgnoreCase("y")){

			myApp.setSecret();

			for (int i = 1; i <= 3; i++){
				System.out.println("What is your guess?");
				guess = userInput.nextInt();
				myApp.setGuess(guess);

				myApp.computeSecret();

				result = myApp.getResult();
				System.out.println(result);

			}

			secretNumber = myApp.getSecretNumber();

			System.out.println("The secret Number was = " + secretNumber);

			System.out.println("Would you like to continue playing? y or n");
			keepPlaying = userInput.next();
		}



	}
}