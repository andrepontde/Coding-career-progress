import java.util.Scanner;
import java.util.Arrays;

public class Anagram{
	public static void main (String args[]){
		String sentence1, sentence2, compare1, compare2;
		int count;
		Scanner userInput = new Scanner(System.in);
		char tempArray1[], tempArray2[];

		System.out.println("Line 1");
		sentence1 = userInput.nextLine();
		System.out.println("Line 2");
		sentence2 = userInput.nextLine();

		if (sentence1.length() == sentence2.length()){
			tempArray1 = sentence1.toCharArray();
			tempArray2 = sentence2.toCharArray();
			Arrays.sort(tempArray1);
			Arrays.sort(tempArray2);


			if (Arrays.equals(tempArray1, tempArray2)){
				System.out.println("They are equal");
			}else {
				System.out.println("They are not equal");
			}

		} else{
			System.out.println("N/A");
		}

	}
}