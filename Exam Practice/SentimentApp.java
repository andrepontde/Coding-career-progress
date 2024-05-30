/*
	SentimentApp.java
	@author André Pont De Anda
	34142342
*/
import java.util.Scanner;

public class SentimentApp{
	public static void main (String args[]){
		//Declare variables
		String sentence, negativeSentence;

		//declare object and Scanner
		Sentiment myApp = new Sentiment();
		Scanner ip = new Scanner(System.in);

		//Ask user for sentence
		sentence = ip.nextLine();
		myApp.setSentence(sentence);

		myApp.compute();

		negativeSentence = myApp.getNegativeSentence();

		System.out.println(negativeSentence);
	}
}