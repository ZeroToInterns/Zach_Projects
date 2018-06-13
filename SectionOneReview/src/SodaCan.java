
public class SodaCan implements Comparable<SodaCan> {

	double radius;
	double height; 
	double currentContents; 
	public static final double DEFAULT_RADIUS = 1.2109;
    public static final double DEFAULT_HEIGHT = 4.704;
    public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
	
	//no argument constructor for soda can
	public SodaCan() {
		//measurements in inches
		this.radius = 1.2109;
		this.height = 4.704;
	}
	
	public SodaCan(double radius, double height) {
		//if negative values entered, set radius and height to default values
		if (radius <= 0.0 || height <= 0.0 ) {
			this.radius = DEFAULT_RADIUS;
			this.height = DEFAULT_HEIGHT;
		}
		else {
			//set radius and height to values entered and calculate the current volume
			this.radius = radius;
			this.height = height;
			//convert volume from cubic inches to fluid ounces
			this.currentContents = (Math.PI * (radius * radius) * height) * FLUID_OUNCES_PER_CUBIC_INCHES;
		}
	}
	//gets the radius of Soda Can
	public double getRadius() {
		return radius;
	}
	//gets height of Soda Can 
	public double getHeight() {
		return height;
	}
	//drink method subtracts fluidOunces parameter from current volume/contents of soda can 
	public void drink(double fluidOunces) {
		this.currentContents = currentContents - fluidOunces;
	}
	//getContents method returns the amount of fluid ounces left in can
	public double getContents() {
		return currentContents;
	}

	//compares current contents of soda can with contents of another soda can 
	@Override
	public int compareTo(SodaCan o) {
		if(this.currentContents > o.currentContents) {
			return 1;
		}
		else if (this.currentContents == o.currentContents) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	
}
