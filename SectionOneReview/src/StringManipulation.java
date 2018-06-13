import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create new scanner object
		Scanner in = new Scanner(System.in);
		//ask for user to input full name
		System.out.print("Enter your full name: ");
		//store user input in name
		String name = in.nextLine();
		//print the first letter of the name
		System.out.println(name.substring(0, 0 + 1));
		//print the full first name
		System.out.println(name.substring(0,name.indexOf(" ")));
		//print out the remaining parts of the name 
		System.out.println(name.substring(name.indexOf(" ") + 1, name.length()));
		
		//print 3 characters starting at index 4
		System.out.println(name.substring(4,7));
	}

}
