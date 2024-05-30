import javax.swing.JOptionPane;


public class EuroApp{
	public static void main(String args[]){
		double amount, twoEuro, oneEuro, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent;

		Euro myEuro = new Euro();

		myEuro.setAmount(Double.parseDouble(JOptionPane.showInputDialog(null,"Amount")));

		myEuro.computeCoins();

		JOptionPane.showMessageDialog(null, "Two"+ myEuro.getTwoEuro()+"\none"+myEuro.getOneEuro()+"\nFiftyCents"+myEuro.getFiftyCent()+"\nTwenty cent"+myEuro.getTwentyCent()+"\nTen cent"+myEuro.getTenCent()+"\nFive cents"+myEuro.getFiveCent()+"\nTwo Cent"+myEuro.getTwoCent()+"\nOne cent"+myEuro.getOneCent());

	}
}