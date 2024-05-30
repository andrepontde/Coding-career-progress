// employee.java

public class Employee{
	// data members
	private String name;
	private int num;
	private double rate, pay;

	//Aqui se declaran las variables primero para que despues la podamos usar, se usan en modo PRIVATE para que solo se puedan modifica al acceder a la clase employee.

	//constructors

	//The set methods are used to well... SET the variables inside this class to soemthing else

	//set methods
	public void setName(String name){
		this.name = name;
		//Here you declare that it has to be the variable with THIS name to be changed.
		//Here you use void since you are just inputing data, not outputing anything
	}

	public void setNum(){
		this.num = num;
	}

	public void setRate(double rate){
		this.rate = rate;
	}

	//my other methods
	public void computePay(){
		pay = rate * 8 * 5;
	}

	//get methods
	public double getPay(){
		return pay;
	}
	//We use get methods to retun said data to the other programs.
	public String getName(){
		return name;
	}
	public int getNum(){
		return num;
	}
	public double getRate(){
		return rate;
	}
}