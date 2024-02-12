//Impport

public class typeCasting{
	public static void main (String args[]){
		int numeroUno = 34;
		int numeroDos = 13;
		double respuesta = numeroUno + numeroDos;
		System.out.println((double)numeroUno/numeroDos);
		//Aqui estamos diciendo que el resultado sea un double, para que pueda dar la respuesta completa.
		//De esta manera podemos hacer que nuestra

		double num1 = 4.5;
		double num2 = 3.6;
		System.out.println((int)(num1/num2));
		//de esta manera estas simplificando a la fuerza un double.
		System.out.println(num1/num2);


		String word = "text saved here";
		System.out.println(word);
		String x = "2";
		String y = "2";
		System.out.println(x+y);
		//Aqui simplemente estamos concatenando.

		int intX = Integer.parseInt(x);
		//Aqui transformando un String a un integer al usar la función Integer.parseInt()
		System.out.println(intX+intX);

		String a = "2.5";
		double doubleA = Double.parseDouble(a);
		//Cuanto estas haciendo parse, despues de el = tienes que usar una mayuscula en el Double o el Integer.
		System.out.println(a+a);
		System.out.println(doubleA + doubleA);
	}
}