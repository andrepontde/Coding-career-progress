public class Gemstone{
	private int month;
	private String gem;

	public void setMonth(int month){
		this.month = month;
	}

	public void calculateGem (){
		switch(month){
			case 1:
				gem = "garnet";
				break;
			case 2:
				gem = "amethys";
				break;
			case 3:
				gem = "aquamarine";
				break;
			case 4:
				gem = "diamond";
				break;
			case 5:
				gem = "emerald";
				break;
			case 6:
				gem = "pearl";
				break;
			case 7:
				gem = "ruby";
				break;
			case 8:
				gem = "peridot";
				break;
			case 9:
				gem = "sapphire";
				break;
			case 10:
				gem = "opal";
				break;
			case 11:
				gem = "topaz";
				break;
			case 12:
				gem = "turquoise";
				break;
		}

	}

	public String getGem(){
		return gem;
	}



}