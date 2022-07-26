package seleniumPracticePackage;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import utilities.Utils;

		public class AssertionSoft extends Utils {

			public static void main(String[] args) {

				getBrowser("chrome", "http://tek-school.com/retail/");
				
				String expectedText = "TEST ENVIRONMENT TekSchool";
				
				WebElement testEnv = driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
				
				String actualText = testEnv.getText();
				
				//Soft Assertion
				
				SoftAssert softAssert = new SoftAssert();
				
				softAssert.assertEquals(actualText, expectedText);
				
				System.out.println("Step after hard assertion!");

				hardWait(6000);
				tearDown();

			}

		}
