package seleniumPratice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserstions {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	 public void testException() {
	 System.out.println("SoftwareTestingMaterial.com");
	 int i = 1 / 0; 
	 }

}
