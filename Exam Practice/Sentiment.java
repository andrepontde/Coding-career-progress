/*
	Sentiment.java
	@author André Pont De Anda
	43534253245

*/

public class Sentiment{
	//data members
	private String sentence, negativeSentence;
	StringBuffer sb = new StringBuffer();

	//constructors
	public Sentiment(){
		sentence = "This is a perfectly good sentence!";
	}

	//set methods
	public void setSentence(String sentence){
		this.sentence = sentence;
	}

	//other methods
	public void compute(){
		for (int i = 0; i < sentence.length(); i++){

				if (sentence.charAt(i) == ' ' && sentence.charAt(i+1) == 'i' && sentence.charAt(i+2) == 's'){
					System.out.println("Paso parte 2");
					sb.append(" is not");
					i = i + 2;
				}else {
					System.out.println("NO paso parte 2");
					sb.append(sentence.charAt((i)));
				}

		}

		negativeSentence = sb.toString();
	}

	//get methods
	public String getNegativeSentence(){
		return negativeSentence;
	}

}