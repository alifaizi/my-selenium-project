package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class SubmitMethod  extends Utils{

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "http://tek-school.com/retail/");
		
		WebElement myAccount = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
		myAccount.click();
		
		WebElement registration = driver.findElement(By.linkText("Register"));
		registration.click();
		
//		WebElement continueBttn = driver.findElement(By.xpath("//input[@value='Continue']"));
//		continueBttn.click();
		
		WebElement lName = driver.findElement(By.id("input-lastname"));
		lName.submit();
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
