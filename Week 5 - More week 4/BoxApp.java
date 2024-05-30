import javax.swing.JOptionPane;

public class BoxApp{
	public static void main(String args[]){
		double length, width, heigth;

		Box myBox = new Box();

		length = Double.parseDouble(JOptionPane.showInputDialog(null, "Length: "));
		width = Double.parseDouble(JOptionPane.showInputDialog(null, "width: "));
		heigth = Double.parseDouble(JOptionPane.showInputDialog(null, "heigth: "));

		Box myBox2  = new Box(length, width, heigth);

		myBox.setLength(length);
		myBox.setWidth(width);
		myBox.setHeigth(heigth);
		myBox.computeBox();

		myBox2.computeBox();

		JOptionPane.showMessageDialog(null, "Result: " + myBox.getArea());
		JOptionPane.showMessageDialog(null, "Result: " + myBox2.getArea());







	}
}