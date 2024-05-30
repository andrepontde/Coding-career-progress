
import javax.swing.JOptionPane;

public class FairgroundApp{
	public static void main(String args[]){
		Fairground myPods = new Fairground();

		int students, pods, waitlist;

		students = Integer.parseInt(JOptionPane.showInputDialog(null, "Amount of studens"));

		myPods.setStudents(students);

		myPods.calculatePods();

		pods = myPods.getPods();
		waitlist = myPods.getWait();

		JOptionPane.showMessageDialog(null, "The amount of pods is: " + pods);
		JOptionPane.showMessageDialog(null, "The amount of students on the waitlist is: " + waitlist);

	}
}