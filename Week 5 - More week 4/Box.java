public class Box{
	private double length, width, heigth, area;

	public Box(){
		area=0;
		length=0;
		width=0;
		heigth=0;
	}

	public Box(double length, double width, double heigth){
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}

	public void setLength(double length){
		this.length = length;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeigth(double heigth){
		this.heigth = heigth;
	}

	public void computeBox(){
		area = length*width*heigth;
	}

	public double getArea(){
		return area;
	}
}