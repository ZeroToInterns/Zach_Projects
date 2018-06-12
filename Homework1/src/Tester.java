
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating instance of student
		Student newStudent = new Student("Michael", 4.0);
		//Calling getName method on newStudent to print the given name
		System.out.println(newStudent.getName());
		//setName method changes "Michael" to "Mike"
		newStudent.setName("Mike");
		//Calling getGpa method on newStudent to print the given Gpa 
		System.out.println(newStudent.getGpa());
		//setName method changes 4.0 to 3.9
		newStudent.changeGpa(3.9);
		//Print new Gpa using getGpa method
		System.out.println(newStudent.getGpa());
	}

}
