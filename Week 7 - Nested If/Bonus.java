public class Bonus{
	private int items, amount, bonus;

	public void setItems(int items){
		this.items = items;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}

	public void calculateBonus(){
		if (items < 3){
			bonus = 10;
		}else if (items > 3){
			if (amount < 1000){
				bonus = 25;
			}else{
				bonus = 50;
			}
		}else{
			bonus = 0;
			System.out.println("Invalid Input.");
		}
	}


	public int getBonus(){
		return bonus;
	}
}