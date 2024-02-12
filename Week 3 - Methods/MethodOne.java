public class MethodOne{
	public static void main (String []args){
	greeting();
	area(5.76);

	}
	//Write our method
	public static void greeting(){
		//Los "Methods" son lo mismo que las functions de JS, y se declaran de la manera que acabas de ver.
		System.out.println("Hello planet");
	}

	public static void area(double radius){
		double area = (radius * radius) * 3.1416;
		System.out.println("The area is: " + area);
	}

	public static int perimeter(int smth){
		int perimetro = smth + smth;
		return perimetro;
		// terminar este codigo
	}
}