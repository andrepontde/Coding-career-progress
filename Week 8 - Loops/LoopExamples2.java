
import java.util.Scanner;

public class LoopExamples2{
	public static void main(String args[]){
		int biggest = 0;
		Scanner myScanner = new Scanner(System.in);

		System.out.println("What is the next number");
		int number = myScanner.nextInt();
		int smallest = number;


		do{
			System.out.println("What is the next number");

			if (number > biggest){
				biggest = number;
			} else if (number < smallest){
				smallest = number;
			}

			number = myScanner.nextInt();

		}while(number != 0);

		System.out.println("The smallest one is: " + smallest);
		System.out.println("The biggest one is: " + biggest);
	}
}