public class CallCentre{
	//Data members
	private String location;
	private String phone;
	StringBuffer strBuff = new StringBuffer();
	private String specials = "!£$%^&*()_-+={}:;@'~#?/>.<,";
	private String call;
	private String lada;
	private int amount;


	//Constructors
	public void CallCentre(){
		location = "Dublin";
		phone = "1234567";
	}

	//Set methods
	public void setLocation(String location){
		this.location = location;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	//Other methods
	public void computeCall(){
		lada = "";
		strBuff.setLength(0);

		boolean bonus = false;
		for (int i = 0; i < 3; i++){
			strBuff.append(phone.charAt(i));
		}

		lada = strBuff.toString();

		System.out.println(strBuff);
		if (location.equalsIgnoreCase("dublin")){
			if (phone.length() == 7){

				if (lada.equals("123")){
					for (int i = 0; i < phone.length(); i++){
						char current = phone.charAt(i);
						for (int x = 0; x < specials.length(); x++){
							if (specials.charAt(i) == current){
								bonus = true;
								break;
							}else{
								bonus = false;
							}
						}

						if (bonus == true){
							break;
						}
					}
					if (bonus == true){
						call = "call has been successfull and a bonus of 20£ have been added to your account";
						amount = 20;
					}else{
						amount = 0;
						call = "Call has been succesfull";
					}

				}else{
					System.out.println("It is not a valid phone lada");
				}
			}else{
				System.out.println("It is not an available phone length");
			}
		}else{
			System.out.println("It is not an available area");
		}
	}


	//Get methods

	public String getCall(){
		return call;
	}

	public int getAmount(){
		return amount;
	}

}