
import java.util.Scanner;

public class NumWords{
	public static void main (String args[]){

		String words;
		int wordCount = 0;
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the sentence you want to write?");
		words = userInput.nextLine();

		for (int i = 0; i < words.length(); i++){
			if (words.charAt(i) == ' '){
				wordCount++;
			}
		}

		wordCount = wordCount + 1;

		System.out.println("The number of words is: " + wordCount);


	}
}