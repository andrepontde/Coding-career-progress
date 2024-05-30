public class Tickets{

		private int age;
		private double cost;

		public Tickets(){
			age = 0;
			cost = 0.0;
		}

		public void setAge(int age){
			this.age = age;
		}

		public void computeCost(){
			if (age < 5){
				cost = 0.0;
			}else if (age >= 5 && age <= 14){
				cost = 5.0;
			}else if (age > 14 && age < 18){
				cost = 10.0;
			}else if (age > 18){
				cost = 15.0;
			}
		}

		public double getCost(){
			return cost;
		}
}