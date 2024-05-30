/*
*ArithmeticOperations.java
*class to perform the basic Arithmetic Operations of add, subtract divide, etc
*/
public class ArithmeticOperations{
	//data members
	private double num1, num2;
	private double result; //to hold the result from any of the methods, see below

	//constructor

	//set methods - one for each input num1 and num2
	public void setNum1(double num1){
		this.num1 = num1;
	}

	public void setNum2(double num2){
		this.num2 = num2;
	}
	//my arithmetic operators - add, sub, multi,div
	public void add(){
		result = num1 + num2;
	}
	public void subtract(){
			result = num1 - num2;
	}
	public void div(){
			result = num1 / num2;
	}
	public void multi(){
			result = num1 * num2;
	}

	//get methods - one for each output, just result
	public double getResult(){
		return result;
	}
}