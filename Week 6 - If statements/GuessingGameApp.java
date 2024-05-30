import javax.swing.JOptionPane;

public class GuessingGameApp{
	public static void main(String args[]){
		int secretNumber, guess;
		String answer;

		GuessingGame myGuess = new GuessingGame();

		secretNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Secret number: "));
		myGuess.setSecret(secretNumber);

		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess: "));
		myGuess.setGuess(guess);

		myGuess.checkGuess();

		JOptionPane.showMessageDialog(null, myGuess.getOutput());


	}
}