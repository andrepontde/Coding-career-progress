import javax.swing.JOptionPane;

public class TweetApp{
	public static void main(String args[]){
		String sentence, newsentence;
		Tweet myApp = new Tweet();

		sentence = JOptionPane.showInputDialog(null, "What is the sentence?");

		myApp.setSentence(sentence);

		myApp.compute();

		newsentence = myApp.getNewSentence();

		JOptionPane.showMessageDialog(null, newsentence);

	}
}