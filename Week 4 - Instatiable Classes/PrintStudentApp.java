//PrintStudentApp.java

import javax.swing.JOptionPane;

public class PrintStudentApp{
	//main
	public static void main (String args[]){
		//variables
		String name;

		Student myStudent;
		myStudent = new Student();
		//myStudent.name();

		name = JOptionPane.showInputDialog(null, "Enter Name");

		myStudent.setName(name);
		name = myStudent.getName();
		JOptionPane.showMessageDialog(null, "This is the name: " + name);

	}
}