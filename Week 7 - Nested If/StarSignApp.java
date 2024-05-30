import javax.swing.JOptionPane;

public class StarSignApp{
	public static void main(String args[]){
		String sign, month;
		int date;

		StarSign myApp = new StarSign();

		month = JOptionPane.showInputDialog(null, "month: ");

		myApp.setMonth(month);

		date = Integer.parseInt(JOptionPane.showInputDialog(null, "Date: "));

		myApp.setDate(date);

		myApp.compute();

		sign = myApp.getSign();

		JOptionPane.showMessageDialog(null, "The sign from the selected date is: " + sign);
	}
}