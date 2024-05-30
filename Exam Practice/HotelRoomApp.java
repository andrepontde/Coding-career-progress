import java.util.Scanner;

public class HotelRoomApp{
	public static void main (String args[]){
		int cost, nightNum, age;
		String email, name;
		boolean validMail = false;

		Scanner userInput = new Scanner(System.in);
		HotelRoom myApp = new HotelRoom();

		System.out.println("What is your name?");
		name = userInput.next();
		System.out.println("What is your age?");
		age = userInput.nextInt();
		System.out.println("Num of nights");
		nightNum = userInput.nextInt();
		System.out.println("Email");
		email = userInput.next();

		for (int i = 0; i < email.length(); i++){
			if (email.charAt(i) == '@'){
				validMail = true;
			}
		}

		if (age >= 18){
			if (validMail){
				myApp.setNights(nightNum);
				myApp.computeCost();
				cost = myApp.getCost();
				System.out.println(cost + " Is the total");
			}else{
				System.out.println("Invali email");
			}
		}else{
			System.out.println("Invalid age");
		}


	}
}