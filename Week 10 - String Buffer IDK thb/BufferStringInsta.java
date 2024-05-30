public class BufferStringInsta{
	//Data members
	StringBuffer strBuff = new StringBuffer();
	String phone;

	//Set method
	public void setPhone(String phone){
		this.phone = phone;
	}

	//Other methods
	public void computeSecret(){

		for (int i = 1; i < (phone.length()-3); i++){
			strBuff.append("x");
			if (i%4 == 0){
				strBuff.append(" ");
			}
		}
		for (int i = 0; i < 4; i++){
			strBuff.append(phone.charAt(i+(phone.length()-4)));
		}

		phone = strBuff.toString();
	}

	//get methods

	public String getHidden(){
		return phone;
	}
}