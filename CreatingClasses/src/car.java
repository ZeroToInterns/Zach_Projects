
public class car extends vehicle {
	
	

	public static void main (String[] args) {
		//Creating new car named myCar from the car class blueprint
		car myCar = new car(); 
		
		//using move function from myCar's superclass called vehicle
		myCar.move();
	}
	
	@Override 
	public void move() {
		System.out.println("the car moved 10 feet"); 
	}
	
	public void drive (){
		System.out.println("the car has moved 5 feet");
	}
}
