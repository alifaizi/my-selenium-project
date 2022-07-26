package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Utils;

public class AssertionInSelenium extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");
		
		String expectedText = "TEST ENVIRONMENT TekSchool";
		
		WebElement testEnv = driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
		
		String actualText = testEnv.getText();
		
		// Hard assertion: If a test step fails, the remaining test steps do not get executed
		// We use hard assertion to validate the application. If it fails, we do not continue 
		// the test execution on the application.
		Assert.assertEquals(actualText, expectedText);

		System.out.println("Step after hard assertion!");

		hardWait(6000);
		tearDown();

	}

}
