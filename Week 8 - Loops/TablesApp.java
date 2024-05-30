import java.util.Scanner;

public class TablesApp{
	public static void main(String args[]){

		int number;

		Scanner userInput = new Scanner(System.in);

		number = userInput.nextInt();
		for(int i = 0; i <= 13; i++){

			System.out.println(number + "*" + i + "=" + (number*i));

		}
	}
}