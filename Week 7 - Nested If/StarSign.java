//André Pont - x23164034
//07/03/24
//StarSign.java

public class StarSign{
	//Data members

	private String sign, month;
	private int date;

	//seters
	public void setMonth(String month){
		this.month = month;
	}

	public void setDate(int date){
		this.date = date;
	}
	//Other methods

	public void compute(){
	//Use a toLowerCase function so the switch only has to go to a lowercase value
		month = month.toLowerCase();
		switch(month){
					case "january":
						if (date >= 1 && date <= 19){
							sign = "Capricorn";
						}else if (date >= 20 && date <= 31){
							sign = "Aquarius";
						}else{
							sign =  "Invalid date";
						}
						// If statement just for each date number.
					break;
					case "february":
						if (date >= 1 && date <= 18){
							sign = "Aquarius";
						}else if (date >= 19 && date <= 28){
							sign = "Pisces";
						}else{
							sign =  "Invalid date";
						}
					break;
					case "march":
						if (date >= 1 && date <= 20){
							sign = "Pisces";
						}else if (date >= 21 && date <= 31){
							sign = "Aries";
						}else{
							sign =  "Invalid date";
						}
					break;
					case "april":
						if (date >= 1 && date <= 19){
							sign = "Aries";
						}else if (date >= 20 && date <= 30){
							sign = "Taurus";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "may":
						if (date >= 1 && date <= 20){
							sign = "Taurus";
						}else if (date >= 21 && date <= 31){
							sign = "Gemini";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "june":
						if (date >= 1 && date <= 20){
							sign = "Gemini";
						}else if (date >= 21 && date <= 30){
							sign = "Cancer";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "july":
						if (date >= 1 && date <= 22){
							sign = "Cancer";
						}else if (date >= 23 && date <= 31){
							sign = "Leo";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "august":
						if (date >= 1 && date <= 22){
							sign = "Leo";
						}else if (date >= 23 && date <= 31){
							sign = "Virgo";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "september":
						if (date >= 1 && date <= 22){
							sign = "Virgo";
						}else if (date >= 23 && date <= 30){
							sign = "Libra";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "october":
						if (date >= 1 && date <= 22){
							sign = "Libra";
						}else if (date >= 23 && date <= 31){
							sign = "Scorpio";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "november":
						if (date >= 1 && date <= 21){
							sign = "Scorpio";
						}else if (date >= 22 && date <= 30){
							sign = "Sagittarius";
						}else{
							sign =  "Invalid date";
						}

					break;
					case "december":
						if (date >= 1 && date <= 21){
							sign = "Sagittarius";
						}else if (date >= 20 && date <= 31){
							sign = "Capriocorn";
						}else{
							sign =  "Invalid date";
						}

					break;
					default:
						sign = "Invalid month";
					break;

		}


	}


	//Geters
	public String getSign(){
		return sign;
	}

}