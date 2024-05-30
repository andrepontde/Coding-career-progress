public class Student{
	private int id;
	private double fees, grade1, grade2;
	private String name, gradeComment;

	public Student(){
		id = 0;
		fees = 80.0;
		name = "";
	}
	public Student(String name, int id, double fees){
		this.name = name;
		this.id = id;
		this.fees = fees;
	}

	public void setId(int id){
		this.id = id;
	}
	public void setFees(double fees){
		this.fees = fees;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setGrade1(double grade1){
		this.grade1 = grade1;
	}
	public void setGrade2(double grade2){
			this.grade2 = grade2;
	}

	public void computeGrade(){
		double result = grade1 + grade2;
		if(result < 40){
			gradeComment = "Fail";
		}else if(result >= 40 && result < 60){
			gradeComment = "Pass";
		}else if(result >= 60 && result < 75){
			gradeComment = "merit";
		}else if (result >= 75 && result <= 100){
			gradeComment = "Distinction";
		}else{
			gradeComment = "Error";
		}
	}

	public String getGradeInfo(){
		return gradeInfo;
	}

	public int getId(){
		return id;
	}

	public double getFees(){
		return fees;
	}

	public String getName(){
		return name;
	}
	public String getDetails(){
		return "Student " +name+ "id; "+id+ "fees: " +fees;
	}
}