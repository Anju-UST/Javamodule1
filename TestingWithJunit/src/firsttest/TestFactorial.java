package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactorial {
	 static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after execuitng all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
	public void testFact() {
		int n=5;
		int expectedValue=120;
		int actualValue=calc.fact(n);
		assertTrue(expectedValue==actualValue);
		//fail("Not yet implemented");
	}
	/*@Test
	public void testFact2() {
		//fail("Not yet implemented");
	}
*/
}
