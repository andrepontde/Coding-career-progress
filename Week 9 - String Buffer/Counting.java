public class Counting{

		private String words;
		private int vowels = 0;
		private int consonants = 0;
		private int spaces = 0;
		private int naturals = 0;

		public void setInput(String words){
			this.words = words;
		}

		public void compute(){

			words = words.toLowerCase();

			for (int i = 0; i < words.length(); i++){
				if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u'){
					vowels++;
				}else if (words.charAt(i) == ' '){
					spaces++;
				}else if (words.charAt(i) == '0' || words.charAt(i) == '1' || words.charAt(i) == '2' || words.charAt(i) == '3' || words.charAt(i) == '4'|| words.charAt(i) == '5' || words.charAt(i) == '6' || words.charAt(i) == '7' || words.charAt(i) == '8' || words.charAt(i) == '9'){
					naturals++;
				}else {
					consonants++;
				}
			}
		}


		public int getVowels(){
			return vowels;
		}

		public int getSpaces(){
			return spaces;
		}

		public int getNumbers(){
			return naturals;
		}



}