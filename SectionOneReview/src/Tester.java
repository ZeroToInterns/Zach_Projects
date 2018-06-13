
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricCar carOne = new ElectricCar("Tesla", 5000);
		
		carOne.charge();
		carOne.drive(4000);
		carOne.getMake();
		carOne.getCurrentRange();
		System.out.println(carOne.getMake());
		System.out.println(carOne.getCurrentRange());
		System.out.println(carOne.getMaxRange());
	}

}
