public class Euro{
    //Data members
    private double amount, twoEuro, oneEuro, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent;

    public void setAmount(double amount){
		this.amount=amount;
	}


	//I could not manage to round the decimal places to the correct value, and we did not learn that in class :c


	public void computeCoins(){

		twoEuro = Math.floor(amount/2);
		amount = amount-(twoEuro*2);
		System.out.println("nex"+amount);


		oneEuro = Math.floor(amount/1);
		amount = amount-(oneEuro*1);
		System.out.println("nex"+amount);



		fiftyCent = Math.floor(amount/.50);
		amount = amount-(fiftyCent*.50);
		System.out.println("nex"+amount);


		twentyCent = Math.floor(amount/.20);
		amount = amount-twentyCent*.20;

		System.out.println("nex"+amount);


		tenCent = Math.floor(amount/.10);
		amount = amount-tenCent*.10;

				System.out.println("nex"+amount);


		fiveCent = Math.floor(amount/.05);
		amount = amount-fiveCent*.05;

			System.out.println("nex"+amount);


		twoCent = Math.floor(amount/.02);
		amount = amount-twoCent*.02;

			System.out.println("nex"+amount);


		oneCent = Math.floor(amount/.01);

	}

	public double getAmount(){
		return amount;
	}

	public double getTwoEuro(){
		return twoEuro;
	}
	public double getOneEuro(){
			return oneEuro;
	}
	public double getFiftyCent(){
			return fiftyCent;
	}
	public double getTwentyCent(){
			return twentyCent;
	}
	public double getTenCent(){
			return tenCent;
	}
	public double getFiveCent(){
			return fiveCent;
	}
	public double getTwoCent(){
			return twoCent;
	}
	public double getOneCent(){
			return oneCent;
	}
}