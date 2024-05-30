import javax.swing.JOptionPane;

public class ComputerSupportApp{
	public static void main(String args[]){
		int time;
		String classname, dayAnswer;

		ComputerSupport mySup = new ComputerSupport();

		ComputerSupport mySup2 = new ComputerSupport(30, "ITP");

		classname = JOptionPane.showInputDialog(null, "Classname: ");
		mySup.setClassname(classname);

		time = Integer.parseInt(JOptionPane.showInputDialog(null, "Time: "));
		mySup.setTime(time);

		mySup.computeDay();
		mySup2.computeDay();


		dayAnswer = mySup.getDayAnswer();

		JOptionPane.showMessageDialog(null, "The day for that lecture is: " + dayAnswer);

		JOptionPane.showMessageDialog(null, mySup2.getDayAnswer());
	}
}