import static org.junit.Assert.*; 
import org.junit.*;

public class Tester {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		ControlFlowPractice practice = new ControlFlowPractice();
//		System.out.println("The cost is $" + practice.calculateCost(59.3));
//		
//		practice.rollDice(4);
//		
//		System.out.println(practice.findLetterAt("o", "Hello World"));
//	}

	//unit testing 
	private ControlFlowPractice practice;
	@Before 
	public void setUp() {
		practice = new ControlFlowPractice();
	}
	
	@Test 
	public void testCalculateCost(){
		assertTrue(practice.calculateCost(100) == 100); 
	}
	@Test
	public void testCalculateCost2(){
		assertTrue(practice.calculateCost(50) == 100); 
	}
	@Test
	public void testCalculateCost3(){
		assertTrue(practice.calculateCost(25) == 50); 
	}
	@Test
	public void testCalculateCost4(){
		assertTrue(practice.calculateCost(0) == 10); 
	}
	@Test
	public void testCalculateCost5(){
		assertTrue(practice.calculateCost(200) == 0); 
	}
	
	
}
