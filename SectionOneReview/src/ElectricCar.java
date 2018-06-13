public class ElectricCar {

	String make; 
	private int maxRange; 
	private int currentCharge;
	
	//car constructor
	public ElectricCar( String Make, int theMaxRange) {
		this.make = Make;
		this.maxRange = theMaxRange; 
		this.currentCharge = 0;
	}
	
	//charges the car
	public void charge() {
		this.currentCharge = this.maxRange;
	}
	
	//drives the car, reduces range by number of miles driven
	public void drive (int miles) {
		if(miles>currentCharge) {
			System.out.println("Not enough gas to go that far");
		}
		else {
		this.currentCharge = currentCharge - miles; 
		System.out.println("After driving " + miles + " miles the current range is " + this.currentCharge);
		}
	}
	
	//returns make of the car
	public String getMake(){
		return this.make; 
	}
	
	//returns the current range of the car based on its charge
	public int getCurrentRange() {
		return this.currentCharge;
	}
	
	//returns max range of car
	public int getMaxRange() {
		return this.maxRange;
	}
	
	
}