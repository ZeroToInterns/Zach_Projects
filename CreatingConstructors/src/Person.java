public class Person {

		private static final int MY_CONSTANT = 123456789; 
		//instance variables
		private String name = "Michael"; 
		private int age = 22; 
		private String hairColor = "Black";
		private String eyeColor = "Black";
		private double weight = 160; 
		private String height = "5'7"; 
		private char gender = 'M'; 
		
		//constructor
		public Person (String name, int age, String hairColor ) {
			//updating instance variable 
			this.name = name; 
			this.age = age; 
			this.hairColor = hairColor; 
		}
		
		//main method 
		public static void main (String[] args) {
			//creates instance of person called newPerson 
			Person myPerson = new Person("Max", 26, "Brown"); 
			System.out.println(myPerson.name);
			System.out.println(myPerson.age);
			System.out.println(myPerson.hairColor);
			
			//changing instance 
			Person person2 = new Person("Harvey", 22, "Yellow"); 
			System.out.println(person2.name);
			System.out.println(person2.age);
			System.out.println(person2.hairColor); 
		}
}

