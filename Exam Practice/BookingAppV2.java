/*
	BookiingAppV2.java
	@Author André Pont De Anda
	04/05/2024
*/

import javax.swing.JOptionPane;

public class BookingAppV2{
	public static void main(String args[]){
	//Declare variables
	String name, number, message;
	int tickets;

	//Create object and JOptionPane
	BookingV2 myApp = new BookingV2();

	//Ask user for data
	name = JOptionPane.showInputDialog(null, "What is your name?");
	myApp.setName(name);

	number = JOptionPane.showInputDialog(null, "What is your number?");
	myApp.setNumber(number);

	tickets = Integer.parseInt(JOptionPane.showInputDialog(null, "amount od tickets?"));
	myApp.setTickets(tickets);

	//Calculate the output
	myApp.calculate();

	//Get result and print it
	message = myApp.getMessage();

	JOptionPane.showMessageDialog(null, message);


	}
}