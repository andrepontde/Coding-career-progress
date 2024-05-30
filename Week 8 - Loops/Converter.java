/*
*Converter.java
*Class to do the convertion operations
*/
public class Converter{
	//data members
	private double cel, fahren, inch, cm;
	private double result;  //use this value for all results so just need 1 get method

	//constructor

	//set methods - one for each input, fahre, cel, inch, cm
	public void setCel(double cel){
		this.cel = cel;
	}

	public void setFahren(double fahren){
		this.fahren = fahren;
	}
	//my conversion operators
	public void convertCeltoF(){
		result = (cel * 1.8) +32;
	}

	public void convertFartoCel(){
		result = fahren -32 *(5/9);
	}



	//get methods - one for each output,
	public double getResult(){
			return result;
	}
}