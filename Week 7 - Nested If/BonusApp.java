import java.util.Scanner;

public class BonusApp{
	public static void main(String args[]){
		int amount, items, bonus;

		Bonus myApp = new Bonus();
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the amount of items sold?");
		items = userInput.nextInt();

		System.out.println("What was the amount sold in €");
		amount = userInput.nextInt();

		myApp.setItems(items);
		myApp.setAmount(amount);
		myApp.calculateBonus();
		bonus = myApp.getBonus();

		System.out.println("The bonus is: " + bonus);

	}
}