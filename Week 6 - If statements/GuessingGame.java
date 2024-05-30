//André Pont
//x23164034
//29/02/2024


public class GuessingGame{
	//data members
	private int secretNumber, guess;
	private String answer;
	//constructors

	//seters
	public void setSecret(int secretNumber){
		this.secretNumber = secretNumber;
	}

	public void setGuess(int guess){
		this.guess = guess;
	}

	//other methods
	public void checkGuess(){
		if (secretNumber > guess){
			answer = "Too low!";
		}else if (secretNumber < guess){
			answer = "Too high!";
		}else if (secretNumber == guess){
			answer = "Perfect!";
		}else{
			answer = "Not a valid answer";
		}
	}

	//geters

	public String getOutput(){
		return answer;
	}
}