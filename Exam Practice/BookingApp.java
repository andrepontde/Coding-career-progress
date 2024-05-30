import java.util.Scanner;


public class BookingApp{
	public static void main(String args[]){
		//Data members
		int required, tickets;
		String phone, name, checker;

		StringBuffer strBuff = new StringBuffer();
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is your name?");
		name = userInput.next();

		System.out.println(name + "what is your phone number?");
		phone = userInput.next();

		strBuff.append(phone.charAt(0));
		strBuff.append(phone.charAt(1));
		strBuff.append(phone.charAt(2));

		checker = strBuff.toString();

		System.out.println(checker);

		if (checker.equals("086") || checker.equals("085") || checker.equals("087")){
			for (int i = 0; i < phone.length(); i++){
				if (phone.charAt(i) == '1' || phone.charAt(i) == '2' || phone.charAt(i) == '3' || phone.charAt(i) == '4' || phone.charAt(i) == '5' || phone.charAt(i) == '6' || phone.charAt(i) == '7' || phone.charAt(i) == '8' || phone.charAt(i) == '9' || phone.charAt(i) == '0'){

				}
			}
		}

		while (true){

		}


	}
}