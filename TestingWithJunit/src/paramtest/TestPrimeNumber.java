package paramtest;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
@RunWith(Parameterized.class)


public class TestPrimeNumber {
	private final Integer inputnumber;
	private final Boolean expectedValue;
	private PrimeNumber primenumber; //objref   this has to create everytime
	
	@Before
	public void initialize() {
		 primenumber = new PrimeNumber();
	}
	


	public TestPrimeNumber(Integer inputnumber, Boolean expectedValue) {
		super();
		this.inputnumber = inputnumber;
		this.expectedValue = expectedValue;
		//this.primenumber = primenumber;
	}

	@Parameterized.Parameters
	
	public static Collection primeNumbers() {
		
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false}}
			//{10,true}}
	);
	}
	


	@Test
	public void testValidate() {
		System.out.println("parameterrized number is"+ inputnumber);
		assertEquals(expectedValue, primenumber.validate(inputnumber));
		
		//fail("Not yet implemented");
	}
}




	
