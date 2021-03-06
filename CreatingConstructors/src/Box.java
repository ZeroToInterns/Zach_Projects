
public class Box {
	
	private double length;
	private double height;
	private double width; 
	
	//constructor
	//instance variables equal to local variables
	public Box(double length, double height, double width) { 
		this.length = length; 
		this.height = height; 
		this.width = width; 
	}
	
	//constructor overloading
	public Box(double sideLength) {
		this.length = sideLength; 
		this.height = sideLength;
		this.width = sideLength;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box firstBox = new Box(10, 15, 20);
		Box secondBox = new Box (10, 15, 20);
		//using non static method
		System.out.println(firstBox.getVolume());
		//using static method
		System.out.println(getVolume(5.0,6.0,2.0));
		
		
		//set new value to length
		firstBox.setLength(50);
		System.out.println(firstBox.getLength());
		Box cube = new Box(5);
	}
	
	//non static method	
	public double getVolume(){		
		//Helper method 
		double result = this.computeArea() * this.height;
		return result;
	}
	
	//static method (overloading) 
	public static double getVolume(double length, double width, double height) {
		double result = length * width * height;
		return result;
	}
	
	//Helper method 
	public double computeArea() {
		double result = this.length * this.width; 
		return result; 
	}

	// Get length of instance and returns it
	public double getLength(){
		return this.length; 
	}
	
	//sets a new value for instance's length 
	public void setLength(double newLength) {
		this.length = newLength;
	}
		

}
