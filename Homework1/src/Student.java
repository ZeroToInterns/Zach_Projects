
public class Student {

	//declaring instance variables
	private String name; 
	private double Gpa; 
	
	//constructor
	public Student(String name, double Gpa) {
		this.name = name;
		this.Gpa = Gpa;
	}
	//getName method returns student's name
	public String getName() {
		return name;
	}
	//setName method sets the name to the new string being passed 
	public void setName(String newName) {
		this.name = newName; 
		System.out.println("The new name is " + newName);
	}
	//getGpa method returns student's Gpa
	public double getGpa() {
		return Gpa; 
	}
	//changeGpa method sets Gpa to the new double value being passed
	public void changeGpa(Double newGpa) {
		this.Gpa = newGpa;
	}
	
	
}
