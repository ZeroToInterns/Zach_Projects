import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File inputFile = new File("GettysburgAddress.txt");
		Counter gettysburgAddress = new Counter(inputFile);
		
		System.out.println(new File(".").getAbsoluteFile());
		System.out.println(inputFile.exists());
		System.out.println(gettysburgAddress.countLines()); 
		System.out.println(gettysburgAddress.countWords()); 
		System.out.println(gettysburgAddress.countChars()); 
	
		
	}

}
