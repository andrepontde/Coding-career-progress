/**
LoopExamples.java
@author André Pont
	print out just even number
	alter to sum all the even numbers and display result
**/

import javax.swing.JOptionPane;

public class LoopExamples{
	public static void main(String args[]){
		int number;


		do{
			number = Integer.parseInt(JOptionPane.showInputDialog(null,"number"));

			for (int i = 0; i <= 20; i++){
				if (((number+i)%2) == 0) {
					System.out.println(number+i);
				}
			}

			for (int i = 0; i <= 1000; i++){
				System.out.println("Te amo <3");
			}
		}while (number != 0);

		for (int i = 0; (i*number) <= 100; i++){
				if (((number*i)%2) == 0) {
					System.out.println(number*i+ "SEXO, PLAYA, LO QUE YO QUIERO CONTIGO DONDE DIGAS YO TE SIGO");
				}
		}
	}
}