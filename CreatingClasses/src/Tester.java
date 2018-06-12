
public class Tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method does not have to be instantiated
		chooseRoom("Dog", false, 'M' );
	}
	
	//determineGender helper method
	private static void determineGender(char gender) {
		if (gender == 'M') {
			System.out.print("This is a male.");
			}
		else if (gender == 'F'){
			System.out.print("This is a female.");
			}
		else {
			System.out.print("Invalid gender.");
		}
	}
	
	//chooseRoom static method method
	public static void chooseRoom(String animal, boolean isSick, char gender ) {
		//checks if animal is a dog
		if (isSick) {
			System.out.println("We don't accept sick animals");
		}
		else {
				 if (animal.equalsIgnoreCase("Dog")) {
					 determineGender(gender); 
					 System.out.println(" Put the dog in the dog room");
				 }
				 else if (animal == "Cat" || animal == "cat") {
					determineGender(gender);
					System.out.println(" Put the cat in the cat room");
				 }
				 else if (animal == "Zebra" || animal == "zebra" ) {
					determineGender(gender);
					System.out.println(" Put the zebra in the zebra room");
				}
			}
	}
}



	

