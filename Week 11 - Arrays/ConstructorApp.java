public class ConstructorApp{
	public static void main(String args[]){
		ConstructorTest myApp = new ConstructorTest();

		myApp.compute();

		int total = myApp.getTotal();

		System.out.println(total);
	}
}