package validation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * Unit test for simple Application.
 */
public class ValidateSAPhoneNumberTest {

	@Parameters("validSAPhoneNumber")
	@Test(priority = 0)
	public void verifyValidSAPhoneNumber(String phoneNumber) {
		
		Assert.assertTrue(validation.validateSAPhoneNumber(phoneNumber));
	}
	
	@Parameters("nonSAPhoneNumber")
	@Test(priority = 1)
	public void verifyNonSAPhoneNumber(String phoneNumber) {
		
		Assert.assertFalse(validation.validateSAPhoneNumber(phoneNumber));
	}
	
	@Parameters("invalidSAPhoneNumberWithSpaces")
	@Test(priority = 2)
	public void verifyInvalidSAPhoneNumberWithSpaces(String phoneNumber) {
		
		Assert.assertFalse(validation.validateSAPhoneNumber(phoneNumber));
	}
	
	@Parameters("invalidSAPhoneNumberWithCharacters")
	@Test(priority = 3)
	public void verifyInvalidSAPhoneNumberCharacters(String phoneNumber) {
		
		Assert.assertFalse(validation.validateSAPhoneNumber(phoneNumber));
	}
	
	@Parameters("invalidSAPhoneNumberWithMoreThanTesnDigits")
	@Test(priority = 3)
	public void verifyinvalidSAPhoneNumberWithMoreThanTesnDigits(String phoneNumber) {
		
		Assert.assertFalse(validation.validateSAPhoneNumber(phoneNumber));
	}
}
