import java.util.Scanner;

public class AnagramV2{
	public static void main (String args[]){
		String word1 = "";
		String word2 = "";
		char active = ' ';
		boolean equal = true;
		int check1 = 0;
		int check2 = 0;
		Scanner userInput = new Scanner(System.in);

		System.out.println("Word 1");
		word1 = userInput.next();
		System.out.println("Word 2");
		word2 = userInput.next();


		if (word1.length() == word2.length()){

			for (int contadorP = 0; contadorP < word1.length(); contadorP++){
				check1 = 0;
				check2 = 0;
				active = word1.charAt(contadorP);

				for (int conta = 0; conta < word1.length(); conta++){
					if (word1.charAt(conta) == active){
						check1++;
					}

					if (word2.charAt(conta) == active){
						check2++;
					}

				}

				if (check1 == check2){
					equal = true;
				}else if (check1 != check2){
					equal = false;
					break;
				}

			}

			if (equal){
				System.out.println("It is an anagram!");
			}else if (equal != true){
				System.out.println("not an anagram!");
			}
		}else {
			System.out.println("Not an anagram");
		}
	}
}