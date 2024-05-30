import javax.swing.JOptionPane;

public class MonthsApp{
	public static void main(String args[]){
		int days;
		String month;

		Months myApp = new Months();

		month = JOptionPane.showInputDialog(null, "Month: ");

		myApp.setMonth(month);

		myApp.calculateMonth();

		days = myApp.getDays();

		JOptionPane.showMessageDialog(null, "The days in that month are (Hopefully): " + days);

	}
}