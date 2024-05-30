public class HotelRoom{
	private int nightNum;
	private int cost;


	public void HotelRoom(){
		nightNum = 0;
	}

	public void setNights(int nightNum){
		this.nightNum = nightNum;
	}

	public void computeCost(){
		cost = 90 * nightNum;
	}

	public int getCost(){
		return cost;
	}
}