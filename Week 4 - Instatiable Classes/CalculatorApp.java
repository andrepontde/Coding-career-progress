import javax.swing.JOptionPane;


public class CalculatorApp{
	public static void main(String args[]){

		double x,y;

		x = Double.parseDouble( JOptionPane.showInputDialog(null, "First number") );
		y = Double.parseDouble( JOptionPane.showInputDialog(null, "Second number") );

		Calculator myCalc = new Calculator();

		myCalc.setNum1(x);
		myCalc.setNum2(y);
		myCalc.computeSum();
		myCalc.computeSubs();

		JOptionPane.showMessageDialog(null, "sum: " + myCalc.getSum());
		JOptionPane.showMessageDialog(null, "Substraction: " + myCalc.getSubs());
	}
}