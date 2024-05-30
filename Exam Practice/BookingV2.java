/*
	Booking.java
	@Author André Pont De Anda x23164034
	04/05/2024
*/

public class BookingV2{
	//Data members
	private String name, message, number;
	private int tickets;

	//Set methods
	public void setName(String name){
		this.name = name;
	}

	public void setNumber(String number){
			this.number = number;
	}

	public void setTickets(int tickets){
			this.tickets = tickets;
	}

	//Constructors
	public BookingV2(){
		name = "André";
		number = "0862707875";
		tickets = 5;
	}

	//Other methods
	public void calculate(){
		String properPhone = "yes";

		if (number.length() == 10){
			if(number.charAt(0) == '0' && number.charAt(1) == '8' ){
				if (number.charAt(2) == '5' || number.charAt(2) == '6' || number.charAt(2) == '7'){
					for (int i = 3; i < number.length(); i++){
						if (number.charAt(i) == '0' || number.charAt(i) == '1' || number.charAt(i) == '2' || number.charAt(i) == '3' || number.charAt(i) == '4' || number.charAt(i) == '5' || number.charAt(i) == '6' || number.charAt(i) == '7' || number.charAt(i) == '8' || number.charAt(i) == '9'){
							properPhone = "yes";
						}else {
							properPhone = "no";
							break;
						}
					}
					if (properPhone.equalsIgnoreCase("yes")){
						message = "Thank you "+name+" the total cost of the booking for mobile number "+number+" is" +(tickets*60);
					}else {
						message = "Not a valid phone number";
					}
				}else{
					message = "Invalid prefix 2";
				}
			}else {
				message = "Invalid prefix 1";
			}
		}else {
			message = "Invalid phone length";
		}
	}


	//Get methods
	public String getMessage(){
		return message;

	}
}
