import javax.swing.JOptionPane;

public class ConverterApp{
	public static void main(String args[]){
	String coice;

	double cm, in, cel, farhen;
	int choice;

	Converter conv = new Converter();

	choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Choice 0,1,2,3"));

	if (choice == 0){
		conv.setCm(Integer.parseInt(JOptionPane.showInputDialog(null, "Cm")));
	}

	conv.setCel(Double.parseDouble(JOptionPane.showInputDialog(null, "Celcius")));
	conv.computeCelToFar();
	JOptionPane.showMessageDialog(null, "The result is "+ conv.getFar());




	}
}