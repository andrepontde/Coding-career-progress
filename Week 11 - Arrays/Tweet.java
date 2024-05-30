/*
	Tweet.java
	André Pont
	22/04/24
*/


public class Tweet{
	//Data members
	private String sentence, newsentence;
	private int specialcounter;
	StringBuffer strBuff = new StringBuffer();

	//constructor
	public Tweet(){
		sentence = "This is a sentence";
	}

	//Set methods
	public void setSentence(String sentence){
		this.sentence = sentence;
	}

	//Other methods
	public void compute(){
		for (int i = 0; i<sentence.length(); i++){
			if (sentence.charAt(i) == ' '){
				if (sentence.charAt(i+1) == 'i'){
					if (sentence.charAt(i+2)== 's'){
						if (sentence.charAt(i+3) == ' '){
							strBuff.append(" is not ");
							specialcounter = specialcounter + 3;
						}
					}
				}
			}
			if ((i+specialcounter) < sentence.length()){
					strBuff.append(sentence.charAt((i+specialcounter)));
			}
		}
		newsentence = strBuff.toString();

	}

	//Get methods
	public String getNewSentence(){
		return newsentence;
	}

}