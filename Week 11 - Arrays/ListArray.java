import java.util.Arrays;

public class ListArray{
	public static void main(String args[]){

		int arr[];

		arr = new int[5];

		arr[0] = 9;

		System.out.println(arr[0]);

		String words[];

		words = new String[3];

		words[0] = "This is the first value";

		int nums[] = {9,8,7};

		String answers[] = {"yes","no"};


		//Two dimentional arrays

		int arr2[][];

		//First bracket is the number of rows, next is the number of coolumns

		arr2 = new int[3][4];

		arr2[0][0] = 9;

		//Declaring all values of a 2D array
		int nums2[][] = {{9,8,7,6},{6,5,4,3},{3,2,1,0}};


		//Transversing trough a 2D array
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				System.out.println(nums2[i][j]);
			}
		}

		for (int i = 0; i < nums2.length; i++){
			for (int j = 0; j < nums2[i].length; j++){
				System.out.println(nums2[i][j]);
			}
		}


		int arra[] = new int[3];

		int len = arra.length;

		double testt[];

		testt = new double[10];

		testt[4] = 50.5;

		System.out.println(testt[4]);

		String[][] arrara;

		arrara = new String[2][3];

		arrara.append("Hola");
	}
}