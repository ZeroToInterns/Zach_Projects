import java.util.*;

import javax.swing.*;

import org.junit.platform.commons.util.StringUtils;

public class LoopFun {

	//getPermutationCount method calculates n!
	public int getPermutationCount(int n) {
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
		String result = "";
		HashSet <String> set= new HashSet<String>();
		try {
			//if word is empty 
			if (word == null || word.isEmpty()) {
				//throw runtime exception with message 
				throw new RuntimeException("String is empty");
			}
			else {
				for (int i = 0; i < word.length(); i++) {
					String currentLetter = word.substring(i, i+1);
					if (set.add(currentLetter)) {
						result += currentLetter;
					}
				}
			}
		}
		//runtime exception thrown here
		catch (RuntimeException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		}
	return result;
	}
	
	//method loops through series and returns sum of all values
	public double sumSeries(int n) {
		double startingNum = 2;
		double result = 0;
		if (n <= 0) {
			result = 0;
		}
		else {
			for (int i = 0; i < n; i++) {
				result += startingNum;
				startingNum = startingNum/2;
			}
		}
		return result;
	}
	
	//method receives integer parameter and multiplies user input numbers
	public int product (int n) {
		//creating new scanner object
		Scanner in = new Scanner(System.in);
		int product = 1;
		if (n==0) {
			product = 0;
		}
		else if (n < 0) {
			product = -1;
		}
		else {
			for(int i = 1; i <= n; i++) {
				System.out.println("Enter integer " + i + ": ");
				//product takes user input and multiplies it by 1, then past input
				product = product * in.nextInt();
			}
		}
		return product;
	}
	
	//method returns exponent in expression 2^i where result is less than value parameter
	public int largestPowerLessThan(int value) {
		if (value <= 1) {
			return -1;
		}
		else {
			for(int i= 0; i< value; i++) {
				//math.pow is static method that does 2^i
				//casting 2^i to integer
				if (value <= (int) Math.pow(2,i)) {
					return i-1;
				}
			}
		}
		return 0;
	}
	
	//method returns sum of all odd values less than value parameter
	public int sumOdd (int value) {
		int sum = 0;
		for(int i = 1; i < value; i = i+2) {
				sum += i;
			}
		return sum;
	}
	
	//method returns the number of E/e in a word 
	public int getEcount(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if( word.substring(i, i + 1).equalsIgnoreCase("e")) {
				count++;
			}
		}
		return count;
	}
}

