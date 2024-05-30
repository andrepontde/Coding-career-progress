public class ConstructorTest{
	private int num1, num2, num3, total;

	public void setNums(int num1, int num2, int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public ConstructorTest(){
		num1 = 5;
		num2 = 5;
		num3 = 5;
	}

	public ConstructorTest(int num1, int num2, int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void compute(){
		total = num1 + num2 + num3;
	}

	public int getTotal(){
		return total;
	}
}