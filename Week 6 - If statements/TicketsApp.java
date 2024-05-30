import javax.swing.JOptionPane;

public class TicketsApp{
	public static void main(String args[]){
		int age;
		double cost;

		Tickets myTicket = new Tickets();

		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Age: "));
		myTicket.setAge(age);
		myTicket.computeCost();
		cost = myTicket.getCost();

		JOptionPane.showMessageDialog(null, cost);

	}
}