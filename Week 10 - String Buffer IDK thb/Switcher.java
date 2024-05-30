	/*
		@Author - André Pont De Anda - x23164034

		11/04/24

		Switcher.java (Instantiable class)

*/

public class Switcher{
	//data members
	private String word, switched;
	StringBuffer sb = new StringBuffer();





	//Set methods
	public void setWord(String word){
		this.word = word;
	}


	//Other methods

	public void compute(){
		for (int i =0; i <= (word.length()-1); i++){
			//Always appends the last letter at the beginnig of the for loop
			if (i == 0){
				sb.append(word.charAt(word.length()-1));
			}else if (i == (word.length()-1)){
				//Appends the first letter at the end of the for loop
				sb.append(word.charAt(0));
			}else {
				sb.append(word.charAt(i));
			}
		}

		//give the switched string the sb value
		switched = sb.toString();
	}


	//get methods
	public String getSwitched(){
		return switched;
	}


}