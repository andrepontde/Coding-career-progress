/**
Number.java
@André Pont De Anda
x23164034
**/

public class Number{
	public static void main(String args[]){
		int F = 5, T = 0, C = 1;
		//Puedes asignar varias variables al mismo tipo de datos de esta manera.
		//Java es obviamente muy similar a javascript, solo que tienes que tener mas cuidado con el syntax.
		while (T < 50) {
			T = F*C;
			System.out.printf("%d + %d = %d \n", C, F, T);
			//Usa printf para usar este formato donde tienes string y variables dentro.
			C = C + 1;
			//En Java para concatenar puedes hacerlo de la siguente manera = ("1 * 5" +5) = 1 * 5 = 5
		}
	}
}