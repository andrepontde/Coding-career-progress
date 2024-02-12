import java.util.Scanner;

public class Room{
	public static void main (String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Specify the width of the room: ");

		double width = keyboard.nextDouble();

		System.out.println("Specify the length of the room: ");

		double length = keyboard.nextDouble();

		double area = (width*length);

		double perimeter = Math.round(2*width+length);

		System.out.printf("The area of the room is %f", area);


	}
}