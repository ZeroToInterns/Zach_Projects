
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLoops looper = new StringLoops();
		looper.printString("Hello World"); 
		looper.printPattern("Hello");
		Person person1 = new Person();
		person1.age = 10;
		Person person2 = new Person(); 
		person2.age = 15; 
		System.out.println(person1.compareTo(person2));
	}

}
