public class Months{
	private String month;
	private int days;

	public void setMonth(String month){
		this.month = month;
	}

	public void calculateMonth(){
		switch(month){
			case "Jan":
			days = 30;
			break;
			case "Feb":
			days = 28;
			break;
			case "Mar":
			days = 31;
			break;
			case "Apr":
			days = 30;
			break;
			case "May":
			days = 31;
			break;
			case "Jun":
			days = 30;
			break;
			case "Jul":
			days = 31;
			break;
			default:
			days = 0;
			break;

		}
	}

	public int getDays(){
		return days;
	}
}