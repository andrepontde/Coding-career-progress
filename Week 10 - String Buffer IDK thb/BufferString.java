import java.util.Scanner;

public class BufferString{
	public static void main(String args[]){
		BufferStringInsta myApp = new BufferStringInsta();
		Scanner userInput = new Scanner(System.in);
		String phone;

		System.out.println("State the number mf");
		myApp.setPhone(phone = userInput.next());

		myApp.computeSecret();

		System.out.println(myApp.getHidden());

	}
}