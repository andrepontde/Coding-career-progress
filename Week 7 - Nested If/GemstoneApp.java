import javax.swing.JOptionPane;

public class GemstoneApp{
	public static void main (String args[]){
		int month;
		String gem;

		Gemstone myApp = new Gemstone();

		myApp.setMonth(Integer.parseInt(JOptionPane.showInputDialog(null, "Month: ")));
		myApp.calculateGem();
		gem = myApp.getGem();

		JOptionPane.showMessageDialog(null, "The gem is: " + gem);

	}
}