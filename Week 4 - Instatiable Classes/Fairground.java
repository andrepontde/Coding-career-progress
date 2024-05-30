public class Fairground{
	//main class
	private int students, waitlist, pods;
	//Data members

	public void setStudents(int students){
		this.students = students;
	}


	public void calculatePods(){
		pods = students/4;
		waitlist = students%4;
	}

	public int getPods(){
		return pods;
	}

	public int getWait(){
		return waitlist;
	}





	// show Input Dialog


	// showMessageDialog



	//set methods seters
	//other methods
	//get methods or geters

}


