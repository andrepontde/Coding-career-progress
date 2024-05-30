import javax.swing.JOptionPane;
import java.util.Scanner;


public class CallCentreApp{
	public static void main (String args[]){
		String location;
		String phone;
		String name;
		String call;
		int amount = 0;
		String keepplaying = "yes";
		Scanner userInput = new Scanner(System.in);

		CallCentre myApp = new CallCentre();

		while(keepplaying.equalsIgnoreCase("yes")){
			name = JOptionPane.showInputDialog(null, "Please state your name");
			location = JOptionPane.showInputDialog(null, "Please state your Location");
			System.out.println("Please state your phone number");
			phone = userInput.next();

			myApp.setLocation(location);
			myApp.setPhone(phone);
			myApp.computeCall();

			call = myApp.getCall();
			amount = amount + myApp.getAmount();

			System.out.println(call);
			System.out.println(name + " your new balance is : " + amount);

			System.out.println("Do you want to call again?");
			keepplaying = userInput.next();


		}



	}
}