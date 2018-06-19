import java.io.*;
import java.util.*;

public class Counter {
	
	private File inputFile;
	
	//constructor takes in file parameter 
	public Counter(File inputFile) {
		this.inputFile = inputFile;
	}
	
	//countLines method counts number of lines in text file 
	public int countLines() {
		int count = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			while(reader.readLine()!= null) {
				count++;
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	//countWords method counts number of words in text file 
	public int countWords() {
		int count = 0;
		try {
			Scanner in = new Scanner(this.inputFile);
			while(in.hasNext()) {
				in.next();
				count++;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	//countChars method counts number of characters in text file
	public int countChars() {
		int count = 0;
		try {
			Scanner in = new Scanner(this.inputFile);
			while(in.hasNextLine()) {
				String Line = in.nextLine();
				count = count + Line.length();
			}
		}
		catch (FileNotFoundException e ) {
			e.printStackTrace();
		}
	return count;
	}

}

