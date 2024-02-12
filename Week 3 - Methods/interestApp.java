import java.util.Scanner;

public class interestApp{
	public static void main (String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please state the amount of months ");
		int months = userInput.nextInt();
		//Prompt the user for the months
		System.out.println("What is the amount owed?");
		double amount = userInput.nextDouble();
		//Prompt the user for the amount owed
		double interest = months*(0.05*amount);
		//Calculate the interst by multiplying the amount times the months times the interest.
		double total = amount+interest;
		//Calculate total by adding the interest to the amount.
		System.out.printf("The amount of interest generated within %d months is %.2f, and the total amount is %.2f \n", months, interest, total);
	}
}