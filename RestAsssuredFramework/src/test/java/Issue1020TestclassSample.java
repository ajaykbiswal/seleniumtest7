

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Issue1020TestclassSample {
	
	
	@Test(dataProvider = "dp")
    public void testMethod(int i) {
        if (i % 2 == 0) {
            Assert.fail("Even tests fail");
        }
    }

    @DataProvider(name="dp")
    public Object[][] getData() {
        Object[][] data = new Object[10][1];
        for (int i = 0; i < 10; i++) {
            data[i][0] = i;
        }
        return data;
    }

}
