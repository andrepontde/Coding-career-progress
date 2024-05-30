/*
*AdvCalcApp.java
*Updated to include options for the user to choose their operation
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
public class AdvCalcApp{
	//main()
	public static void main(String args[]){
		//vars
		double num1, num2, result, cel, fahren;
		int choice;
		String answer;

		Scanner userInput = new Scanner(System.in);
		//declare and create objects - 2 create one for each class being used
		ArithmeticOperations ao = new ArithmeticOperations();
		Converter c = new Converter();

		//get the user choice of operation
		choice = Integer.parseInt( JOptionPane.showInputDialog(null, "1: add, \n2: sub, \n3: cel-f, \n4: fahren-c")   );

		do{
			//selection statements used
			if(choice == 1){
				//ask for num1, num2, call setters, add(), use getter to display result
				num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Num1 to add"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Num2 to add"));
				ao.setNum1(num1);
				ao.setNum2(num2);
				ao.add();
				JOptionPane.showMessageDialog( null, ao.getResult() );
			}else if(choice == 2){
				//ask for num1, num2, call setters, call subtract methods, show result

			}else if(choice == 3){
				//ask for celcius, call the setter, call the convert method, show result
				cel = Double.parseDouble(JOptionPane.showInputDialog(null, "celcius to convert"));
				c.setCel(cel);
				c.convertCeltoF();
				JOptionPane.showMessageDialog( null, c.getResult() );

			}else if(choice == 4){
				//ask for fahrenheit, call the setter, call the convert method, show the result
			}else{
				JOptionPane.showMessageDialog(null, "Invalid choice");
			}
			answer = userInput.next();

		}while (answer.equalsIgnoreCase("yes"));
	}
}