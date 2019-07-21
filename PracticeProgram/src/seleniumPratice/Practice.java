package seleniumPratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.authenticateUsing(new UserAndPassword("username","password"));
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("./Screenshots/facebooj.png"));
		
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("scroll(0,400)");
		
//		je.executeScript("arguments[0].scrollIntoview(true);"ele);
	}

}
