package testExceptions;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TellerTest {
	Teller teller=new Teller();
	

	

	@Test(expected =InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
		teller.validateTransaction("EUR", -100);
		//fail("Not yet implemented");
	
	}
@Test(expected=IllegalArgumentException.class)
public void testValidateTransactionUnAcceptedCurrency() {
	teller.validateTransaction("AUSD", 100);
}

}
