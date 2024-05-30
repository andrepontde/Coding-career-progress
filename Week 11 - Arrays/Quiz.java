/*
Andre Pont de Anda
18/04/24
Quiz.java
*/


public class Quiz{
	//Data members
	private int counter = 0;
	private double worst, best;
	private double grades[][] = new double[5][3];
	private double worstandbest[] = new double[11];

	//Set methods
	public void setGrades(double grades[][]){
			this.grades = grades;
	}

	//Other methods
	public void compute(){
			worst = grades[0][0];
			best = grades[0][0];

			for(int student = 0; student < grades.length; student++){
				worst = grades[student][0];
				best = grades[student][0];
				for(int quiz = 0; quiz < grades[student].length; quiz++){


					if(grades[student][quiz] < worst){
						worst = grades[student][quiz];
					}

					if(best < grades[student][quiz]){
						best = grades[student][quiz];
					}
					if (quiz == 2){
						counter++;
						worstandbest[counter] = worst;
						counter++;
						worstandbest[counter] = best;
					}

				}
			}

	}

	public double[] getWorstandbest(){
		return worstandbest;
	}
}