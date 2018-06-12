
public class Circle {
	
	private static double radius;
	
	public double computeArea(double radius) {
		double pi = 3.14;
		double area = pi*(radius*radius);
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circleOne = new Circle();
		circleOne.radius = 9.0; 
		Circle circleTwo = new Circle();
		System.out.println(circleTwo.radius);
		System.out.println(circleOne.computeArea(circleOne.radius));
	}

}
