/*
	@Author - André Pont De Anda - x23164034

	11/04/24

	SwitcherApp.java (Main class)
*/

import java.util.Scanner;

public class SwitcherApp{
	public static void main(String args[]){
		String word, switched;
		Scanner userInput = new Scanner(System.in);
		Switcher myApp = new Switcher();

		System.out.println("What is the word?");
		word = userInput.nextLine();
		myApp.setWord(word);
		myApp.compute();
		switched = myApp.getSwitched();

		System.out.println("The word with the modification is: " + switched);

	}
}