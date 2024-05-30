import java.util.Scanner;


public class BufferTest{
	public static void main (String args[]){
		StringBuffer strBuff;
		strBuff = new StringBuffer();

		Scanner userInput = new Scanner(System.in);

		strBuff.append("H");
		strBuff.append("ola");

		System.out.println(strBuff);

		String word;

		word = strBuff.toString();

		System.out.println(word);

		// Replace app



		String name, newName;
		StringBuffer strBuff2;
		strBuff2 = new StringBuffer();

		System.out.println("What is your name?");
		name = userInput.next();

		for (int i = 0; i < name.length(); i++){
			if((name.toLowerCase()).charAt(i) == 'a'){
				strBuff2.append('*');
			}else {
				strBuff2.append(name.charAt(i));
			}
		}

		newName = strBuff2.toString();

		System.out.println(newName);





	}
}