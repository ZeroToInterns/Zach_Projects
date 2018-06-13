
public class SubSandwich {
	
	private int type;
	private int size; 
	private boolean extraMeat;

	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50; 
	
	public SubSandwich(int theType, int theSize, boolean extraMeat) {
		//if type is not chicken or pastrami
		if (theType != CHICKEN && theType != PASTRAMI) {
			//set type to pastrami
			this.type = PASTRAMI;
		}
		else {
			this.type = theType;
		}
		//if size is not 6 or 12
		if (theSize != 6 && theSize != 12) {
			//set size to 12 
			theSize = 12;
		}
		else {
			this.size = theSize;
		}
		
		this.extraMeat = extraMeat;
	}
	
	//getSize method returns size 
	public int getSize() {
		return size;
	}
	
	//setSize method sets new size for the sub 
	public void setSize(int newSize) {
		if (newSize != 6 && newSize != 12) {
			System.out.println("Invalid size");
		}
		else {
			this.size = newSize;
		}
	}
	
	//isExtraMeat method checks if there is extra meat
	public boolean isExtraMeat() {
		if (extraMeat == true) {
			return true;
		}
		else if (extraMeat == false) {
			return false; 
		}
		else {
			return false;
		}
	}
	
	//getType method returns type of sandwich
	public String getType() {
		String result;
		if (type == 0) {
			result = "Chicken";
		}
		else if (type == 1) {
			result = "Pastrami";
		}
		else {
			result = "Invalid";
		}
		return result;
	}
	
	//getCost method returns cost of sandwich
	public double getCost() {
		double cost1 = 0;
		double cost2 = 0;
		
		if (type == 0 && size == 6 ) {
			cost1 = 5.50;
		}
		else if (type == 0 && size == 12) {
			cost1 = 8.95;
		}
		else if (type == 1 && size == 6) {
			cost1 = 6.95;
		}
		else if (type == 1 && size == 12) {
			cost1 = 9.50;
		}
		
		if (extraMeat) { 
			cost2 = cost1 + 1.50;
		}
		else {
			cost2 = cost1;
		}
		
		return cost2;
	}
	
	
}
