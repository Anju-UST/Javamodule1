package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator calc ;
	@Before
	public void setup() throws Exception{
		calc = new Calculator();
	}
	
	@Test 
	public void testPowerZero() {
		int inputBase=0;
		int exp=0;
		int expectedValue=1;
		int actualValue = calc.power(inputBase,exp);
		//System.out.println(actualValue); 1
		//assertTrue(expectedValue==actualValue);  double
		assertEquals(expectedValue,actualValue);
		
	}

	@Test
	public void testPower() {
		int inputBase=2;
		int exp=3;
		int expectedValue=8;
		int actualValue= calc.power(inputBase, exp);
		assertTrue(expectedValue==actualValue);
	//assertEquals(expectedValue,actualValue);
		
	//	fail("Not yet implemented");
	}

}
