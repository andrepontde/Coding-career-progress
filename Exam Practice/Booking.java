/*
	Date - 30/03/2024

	Author - André Pont De Anda - x23164034

*/

public class Booking{
	//Data members
	private int required;
	private String phone;
	private int tickets;

	//Constructors
	public void Booking(){
		required = 4;
		phone = "0862707875";
	}

	//Set methods

	public void setRequired(int required){
		this.required = required;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	//Other methods

	public void compute(){
		tickets = required * 60;
	}

	//Get Methods
	public int getTickets(){
		return tickets;
	}
}
