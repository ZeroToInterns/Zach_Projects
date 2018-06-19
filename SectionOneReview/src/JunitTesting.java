import static org.junit.Assert.*;
import org.junit.*;

public class JunitTesting {

	private LoopFun obj; 
	
	@Before 
	public void setup() {
		obj = new LoopFun();
	}
	@Test
	public void testPermutationCount() {
		assertEquals(obj.getPermutationCount(8), 40320);
		assertEquals(obj.getPermutationCount(0), 0);
		assertEquals(obj.getPermutationCount(-1), 0);
		assertEquals(obj.getPermutationCount(1), 1);
	}
	
	@Test
	public void removesDuplicates() {
		assertEquals(obj.removesDuplicates("seeped"), "sepd");
	}
	
//	@Test 
//	public void sumSeries() {
//		assertEquals(obj.sumSeries(1),2.0);
//	}
	

	@Test 
	public void testLargerPowerLessThan() {
		assertEquals(obj.largestPowerLessThan(16),3);
	}
	
	@Test 
	public void testSumOdd() {
		assertEquals(obj.sumOdd(8),16);
	}
	
	public void testGetECount() {
		assertEquals(obj.getEcount("apple"),1);
	}
}
