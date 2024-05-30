public class TrainingWheels{
	private int num1,num2,total;

	public void setNum1(int num1){
		this.num1 = num1;
	}
	public void setNum2(int num2){
		this.num2 = num2;
	}

	public void calculate(){
		total = num1+num2;
	}

	public int getTotal(){
		return total;
	}
}