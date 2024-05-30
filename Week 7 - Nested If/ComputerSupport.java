public class ComputerSupport{
	private int time;
	private String classname, dayAnswer;

	public ComputerSupport(){
		time = 0;
		classname = "";
		dayAnswer = "";
	}

	public ComputerSupport(int time, String classname){
		this.time = time;
		this.classname = classname;
	}

	public void setTime(int time){
		this.time = time;
	}
	public void setClassname(String classname){
		this.classname = classname;
	}

	public void computeDay(){
		if  (classname.equals("ITP")){
			if (time == 30){
				dayAnswer = "Monday";
			}else if (time == 60){
				dayAnswer = "Tuesday";
			}else{
				dayAnswer = "Not a valid input";
			}
		} else if (classname.equals("DMM")){
			if (time == 30){
				dayAnswer = "Thursday";
			}else if (time == 60){
				dayAnswer = "Friday";
			}else{
				dayAnswer = "Not a valid input";
			}
		}else if (classname.equals("ITD")){
			if (time == 30){
				dayAnswer = "Friday";
			}else if (time == 60){
				dayAnswer = "Wednesday";
			}else{
				dayAnswer = "Not a valid input";
			}
		}else{
			System.out.println("Not a valid input");
		}
	}

	public String getDayAnswer(){
		return dayAnswer;
	}



}