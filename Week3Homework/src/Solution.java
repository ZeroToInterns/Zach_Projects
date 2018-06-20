import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		//int n is used for number of lines
		int n = in.nextInt();
		ArrayList<ArrayList<Integer>> myArrayList = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			//int d used for number of integers on line
			int d = in.nextInt();
			//new array list to store inside myArrayList
			ArrayList<Integer> rows = new ArrayList();
			
			for(int j = 0; j < d; j++) {
				//Loops through user specified number of elements
				rows.add(in.nextInt());
			}
		//add rows Array List to myArrayList
		myArrayList.add(rows);
		}
		
		// q is used for number of queries
		int q = in.nextInt();
		for(int i = 0; i < q; i++ ) {
			//x = row
			int x = in.nextInt();
			//y = position
			int y = in.nextInt();
			
			//use try/catch to print error is index is out of bounds 
			try {
				System.out.println(myArrayList.get(x - 1).get(y - 1));
			} 
			catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
	}
	
}