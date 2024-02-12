/**
Develop an application that prints the timestables for your chosen number.

i.e. For the number 8 you would print:
8 times 0 is 0
8 times 1 is 8
8 times 2 is 16
8 times 3 is 24

and so on until you reach 12.

Save the file as TimesTables.java

@André Pont De Anda
x23164034
**/

public class TimesTables{
	public static void main(String args[]){
		int N = 8, T = 0, M = 0;
		while (T < 13){
			M = N * T;
			System.out.printf("%d times %d is %d \n", N, T, M);
			T++;
		}
	}
}

