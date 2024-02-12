//EmployeeApp.java
import javax.swing.JOptionPane;

public class EmployeeApp{
	//main()
	public static void main (String args[]){
		String name;
		int num;
		double rate;

		//declare and create my object
		Employee myEmp = new Employee();

		name = JOptionPane.showInputDialog(null, "Name: ");
		rate = Double.parseDouble(JOptionPane.showInputDialog(null, "Rate: "));

		myEmp.setName(name);
		myEmp.setRate(rate);
		myEmp.computePay();
		JOptionPane.showMessageDialog(null, myEmp.getPay()); //using the return data by printing it
	}
}