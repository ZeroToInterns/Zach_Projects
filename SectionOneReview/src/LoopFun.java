import java.util.*;

import javax.swing.*;

public class LoopFun {

	//getPermutationCount method calculates n!
	public static int getPermutationCount(int n) {
		//initialize number of permutations to 1, single number always has one unique way of formatting
		int numOfPermutations = 1;
		//if parameter is less than or equal to 0
		if (n <= 0) {
			//no permutations available
			numOfPermutations = 0;
			}
		else {
			//for loop that increments until i equals parameter value
			for (int i = 1; i <= n; i++) {
				numOfPermutations = numOfPermutations * i;
			}
		}
		return numOfPermutations;
	}
	
	//removesDuplicates method returns string with one of each unique letter in given order 
	public String removesDuplicates(String word) {
		String string2 = null;
		try {
			//if word is empty 
			if (word == null || word.isEmpty()) {
				//throw runtime exception with message 
				throw new RuntimeException("String is empty");
			}
			else {
				//convert string to new character array
				char[] chars = word.toCharArray();
				//convert array to Linked Hash set to preserve ordering and remove duplicates
				Set <Character> charSet = new LinkedHashSet<Character>();
				//for loop loops through each element in array 
				for (char c: chars) {
					//add each unique letter to the array 
					charSet.add(c);
				}
				//like String, but treated like variable length array 
				StringBuilder sb = new StringBuilder();
				//loop through each character in charSet (linked hash set)
				for (Character character: charSet) {
					//.append method adds the last character to the string builder
					sb.append(character);
				}
				//method returns string, convert StringBuilder to string
				string2 = sb.toString();
			}
		}
		//runtime exception thrown here
		catch (RuntimeException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		}
	return string2;
	}
	
	//loops through series and returns sum of all values
	public double sumSeries(int n) {
		int count =0;
		double sum = 0;
		//if parameter is 0 or negative
		if (n <= 0) {
			sum = 0;
		}
		else { 
			for (int i = 2; i > 0; i = i/2) {
				sum+=i;
				count++;
				if (count == n) {
					return sum;
				}
			}
		}
		return sum;
	}
}

