import java.util.Scanner;

public class Circle2App{
	public static void main(String args[]){
		double radius;
		Scanner userInput = new Scanner(System.in);


		System.out.println("What function do you want to use? use c for circumference and a for area");
		String choice = userInput.next();

		if (choice.equalsIgnoreCase("c")){
			System.out.println("what is the radius?");
			radius = userInput.nextDouble();
			System.out.println("the circumference is: "  + circumference(radius));

		}else if (choice.equalsIgnoreCase("a")){
			System.out.println("what is the radius?");
			radius = userInput.nextDouble();
			area(radius);
		}else if (choice.equalsIgnoreCase("d")){
			System.out.println("what is the radius?");
			radius = userInput.nextDouble();
			System.out.println("The diameter is: " + diameter(radius));
		}

	//This way you can create a method which is the equivalent to functions in JS
	//public static stays the same but the VOID can be replaced with int, double etc to be able to return a value instead of directly printing out something
	//the values inside the () are the inputs of the method, and can be used within the method only, you also need to declare its datatype first as shown below.

	}
	public static double circumference(double radius){
		double circumference = 2*3.1416*radius;
		return circumference;
	}

	public static void area(double radius){
		double area = (radius * radius) * 3.1416;
		System.out.println("Area; " +area);
	}

	public static double diameter(double radius){
		double diameter = radius*2;
		return diameter;
	}

}