public class GuessingGame{
	//Data members


	int guess, secretNumber;
	String result;

	//set methods

	public void setGuess(int guess){
		this.guess = guess;
	}

	public void setSecret(){
		secretNumber = (int)(Math.random() * (10 - 1 + 1) + 1);
	}


	//other methods
	public void computeSecret(){

		if (guess == secretNumber){
			result = "Congratulations, you guessed correctly!";
		}else if (guess > secretNumber){
			result = "You guessed too high, sorry!";
		}else if (guess < secretNumber){
			result = "You guessed to low, sorry!";
		}else{
			result = "That is not a valid input!";
		}


	}

	public int getSecretNumber(){
		return secretNumber;
	}

	public String getResult(){
		return result;
	}

}