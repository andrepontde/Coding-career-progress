import javax.swing.JOptionPane;

public class CountingApp{
	public static void main(String args[]){
		String words;
		int spaces = 0;
		int vowels = 0;
		int naturals = 0;

		Counting myApp = new Counting();

		words = JOptionPane.showInputDialog(null,"Give a sentence: ");

		myApp.setInput(words);

		myApp.compute();

		spaces = myApp.getSpaces();
		vowels = myApp.getVowels();
		naturals = myApp.getNumbers();

		System.out.println("Spaces: "+ spaces+ " Vowels: "+ vowels + " numbers:  "+ naturals);

	}
}