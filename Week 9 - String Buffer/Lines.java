
import java.util.Scanner;

public class Lines{
	public static void main (String args[]){

		String words;
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the sentence you want to write?");
		words = userInput.nextLine();

		System.out.println(words.length()+ "\n"+ words);

		for (int i = 0; i < words.length(); i++){
			if (words.charAt(i) == ' ' ){
				System.out.println(" ");
			}else {
				System.out.println(words.charAt(i));
			}
		}



	}
}