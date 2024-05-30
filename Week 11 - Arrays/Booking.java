public class Booking{
	private int numTickets;
	private String name, mob, msge;
	private double cost;
	private final double price = 60;

	public Booking(){
		name = mob = msge = "";
		numTickets = 0;
		cost = 0.0;

	}

	public void setName(String name){
		this.name = name;

	}

	public void setTickets(int tickets){
		this.numTickets = tickets;
	}

	public void setMob(String mob){
		this.mob = mob;
	}


	public void compute(){
		if (mob.charAt(0) == '0' && mob.charAt(1) == '8'){
			if (mob.charAt(2) == '5' || mob.charAt(2) == '6' || mob.charAt(2) == '7'){
				cost = price * numTickets;
				msge = "Thank you" + name+ " The total cost of the booking for " + mob+ "is"+ cost;
			}else{
				msge = "invalid phone number";
			}
		}else {
			msge ="Invalid mobile";
		}
	}

	public String getMessage(){
		return msge;
	}

	public double getCost(){
		return cost;
	}



}