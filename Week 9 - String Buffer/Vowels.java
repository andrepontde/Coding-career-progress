public class Vowels{
	public static void main(String args[]){
		StringBuffer strBuff = new StringBuffer();
		String words;
		int vowels = 0;
		int consonants = 0;

		words = "Hola como estás hijoeputa";

		for (int i = 0; i < words.length(); i++){
			if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u'){
				vowels++;
			}else if (words.charAt(i) == ' '){

			}else{
				consonants++;
			}
		}

		System.out.println("Vowels = " + vowels + "Conson" + consonants);

	}
}