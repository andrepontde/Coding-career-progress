import java.util.Scanner;

public class QuizApp{
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		double grades[][] = new double[5][3];
		double worstandbest[] = new double[10];


		Quiz myApp = new Quiz();

		for(int i = 0; i < grades.length; i++){
			for(int j = 0; j < grades[i].length; j++){
				System.out.println("Student"+(i+1)+"Grade n"+(j+1)+": ");
				grades[i][j] = userInput.nextDouble();
			}
		}

		myApp.setGrades(grades);
		myApp.compute();

		worstandbest=myApp.getWorstandbest();



		int counter = 1;
		for (int i = 1; i < 11; i++){
			if ((i%2)==0){
				System.out.println("The best grade of student "+counter+" is:" + worstandbest[i]);
				counter++;
			}else {
				System.out.println("The worst grade of student "+counter+"is:"+ worstandbest[i]);
			}
		}



	}

}