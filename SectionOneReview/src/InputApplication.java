
import java.util.Scanner;

public class InputApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create new scanner object
		Scanner in = new Scanner(System.in);
		//ask for user input 
		System.out.print("Enter your favorite dessert: ");
		//store user input
		String favDessert = in.nextLine();
		//print last letter of dessert
		System.out.println(favDessert.substring(favDessert.length() -1));
		
		//ask user for double input
		System.out.print("Enter a double: ");
		double num1 = in.nextDouble();
		System.out.print("Enter an integer: ");
		int num2 = in.nextInt();
		
		//print product 
		//casting double value to integer 
		int product = (int) num1 * num2;
		System.out.println(product);
	}

}
