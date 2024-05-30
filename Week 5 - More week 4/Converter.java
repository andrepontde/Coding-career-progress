public class Converter{
	private double cm, in, cel, farhen;

	public Converter(){
		cm = 0.0;
		in = 0.0;
		cel = 0.0;
		farhen = 0.0;
	}

	public void setCm(double cm){
		this.cm = cm;
	}

	public void setIn(double in){
		this.in = in;
	}

	public void setCel(double cel){
		this.cel = cel;
	}

	public void setFarhen(double farhen){
		this.farhen = farhen;
	}

	//other methods
	public void compute(){
		in = cm/2.54;
	}

	public void computeIntoCm(){
		cm = in*2.54;
	}

	public void computeCelToFar(){
		farhen = cel*1.8+32;
	}
	public void computeFarToCel(){
		cel = farhen/1.8-32;
	}

	public double getCm(){
		return cm;
	}

	public double getIn(){
		return in;
	}

	public double getCel(){
		return cel;
	}

	public double getFar(){
		return farhen;
	}
}