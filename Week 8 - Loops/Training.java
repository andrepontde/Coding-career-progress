import javax.swing.JOptionPane;

public class Training{
	public static void main(String args[]){
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Number"));
		int conta = 1;

		while (conta < 10){
			System.out.println(number*conta*2);
			conta++;
		}

	}
}