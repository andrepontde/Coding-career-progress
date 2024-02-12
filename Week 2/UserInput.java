import java.util.Scanner;

public class UserInput{
	public static void main(String args[]){
		Scanner UserInput = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = UserInput.nextInt();
		System.out.printf("Your age is %d!! \n", age);
		System.out.printf("What is your blood type?");
		String bloodType = UserInput.next();
		if (bloodType.equalsIgnoreCase("O-")){
			System.out.println("We are compatible OMG!");
		}else{
			System.out.printf("Your blood type is %S!! \n", bloodType);

		}
	}
}