
public class Person implements Comparable, Speakable {

	//must implement all methods inside comparable interface 
	public String name;
	public double GPA;
	public int age;
	
	@Override
	//create a compareTo method that compares two people by age 
	public int compareTo(Object o) {
		//converts o to person data type (casting)
		Person otherPerson = (Person) o;
		if(this.age < otherPerson.age) {
			return -1;
		}
		else if (this.age > otherPerson.age) {
			return 1;
		}
		else {
			return 0;
		}
	}


	@Override
	public void speak() {
		System.out.println("Hello my name Jeff");
	}
}


