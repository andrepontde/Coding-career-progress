public class Calculator{

	//data members

	private double numOne;
	private double numTwo;
	private double sum;
	private double subs;

	//Constructors
	public Calculator(){
		numOne=0;
		numTwo=0;
		System.out.println("Constructor running"); // Whatever is here will be run when calling the calculator.
	}


	//Set methods

	public void setNum1(double numOne){
		this.numOne = numOne;
	}

	public void setNum2(double numTwo){
			this.numTwo = numTwo;
	}

	//Other methods

	public void computeSum(){
			sum = numOne + numTwo;
	}

	public void computeSubs(){
			subs = numOne - numTwo;
	}

	//Get methods

	public double getSum(){
		return sum;
	}

	public double getSubs(){
		return subs;
	}

}