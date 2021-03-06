
public class StringLoops {
	
 
	public void printHundreds() {
		for (int i = 0; i < 100; i++) {
			System.out.println("The value is " + i);
		}
	}
	
	public void printEvens() {
		for (int i= 0; i < 100; i+=2) {
			System.out.println("The value is " + i);
		}
	}
	
	//regular for loop
	public int countNumberOfO(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++ ) {
			//substring upper limit exclusive
			//equalsignorecase method allows for both O/o
			if (word.substring(i, i+1).equalsIgnoreCase("o")) {
				count++;
			}
		}
		return count;
	}
	
	//nested for loop example 
	public void printPattern(String word) {
		//loops through entire length of word
		for (int i = 0; i < word.length(); i++) {
			//nested for loop repeats every letter by their index 
			for(int j = 0; j < i + 1; j++) {
				//prints the letter then loops back 
				System.out.print(word.substring(i, i + 1));
			}
			//new line 
			System.out.println("");
		}
	}
	
	//using try and catch 
	public void printString(String word) { 
		try { 
			for (int i = 0; i < word.length() +1; i++) {
				System.out.print(word.substring(i, i+ 1));
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("");
			System.out.println(e.getLocalizedMessage());
		}
	}

	
	//using modified for loop to iterate over entire string
	//error because string is not subclass of collection
//	public int countNumberofO2 (String word) {
//		int count = 0;
//		for(String firstLetter: word) {
//			if (firstLetter.equalsIgnoreCase("o")) {
//				count++; 
//			}
//		}
//		return count;
//	}
}

