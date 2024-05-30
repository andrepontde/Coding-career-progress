import javax.swing.JOptionPane;

public class StudentApp{
	public static void main (String args[]){
		String name;
		int id;
		double fees;

		Student em;
		em = new Student("André Pont", 400, 2000.00);

		Student ap = new Student();

		JOptionPane.showMessageDialog(null, em.getDetails() );

		name = JOptionPane.showInputDialog(null, "Enter name");
		id = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Id"));
		fees = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter fees "));

		ap.setName(name);
		ap.setId(id);
		ap.setFees(fees);

		JOptionPane.showMessageDialog(null, ap.getDetails() );

		Student gp = new Student();


	}
}