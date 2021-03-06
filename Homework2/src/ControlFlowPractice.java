
public class ControlFlowPractice {

	//Method calculates cost based on distance
	public double calculateCost(double distance) {
		double cost;
		//distance greater than or equal to 50
		if (distance >= 50 && distance <= 100) {
			cost = 100.0;
		}
		//distance less than 50 and greater than or equal to 25
		else if (distance >= 25 && distance < 50 ) {
			cost = 50.0;
		}
		//distance less than 25 and greater than or equal to 0
		else if (distance >= 0 && distance < 25) {
			cost = 10.0;
		}
		else {
			cost = 0.0;
		}
		return cost; 
	}
	
	public void rollDice(int value) {
		String format;
		switch(value) {
		case 1: format = "The value rolled is 1";
				break;
		case 2: format = "The value rolled is 2";
				break;
		case 3: format = "The value rolled is 3";
				break;
		case 4: format = "The value rolled is 4";
				break;
		case 5: format = "The value rolled is 5";
				break;
		case 6: format = "The value rolled is 6";
				break;
		default: format = "Invalid value"; 
				break;
		}
		System.out.println(format);
	}
	
	public int findLetterAt(String letter, String word) {
		//initialize count
		int count = 0;
		//loop through word
		for (int i = 1; i < word.length(); i++ ) {
			//get substring of word at position i and compare it to letter we want to find
			if (word.substring(i, i+1).equalsIgnoreCase(letter)) {
				//if count = 1, return position
				if (count == 1 ) {
					return i;
				}
				else {
					//increment count
					count++;
				}
			}
		}
		return 0;
	}
}
