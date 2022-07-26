package seleniumPracticePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class LocatorAssignment extends Utils {

	public static void main(String[] args) {
		
		// Launching the Facebook page on chrome browser
		Utils.getBrowser("chrome", "https://www.facebook.com");
		
		// Clicking on Creat new account
		WebElement creatNewAccount = driver.findElement(By.linkText("Create new account"));
		creatNewAccount.click();
		
		// Enter first name
		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		firstName.sendKeys("Ali");
		
		//Enter last name
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Faizi");
		
		// Enter email
		WebElement emailAdd = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailAdd.sendKeys("myemail@gmail.com");
		
		// Confirm Email
		WebElement emailAddAconfirm = driver.findElement(By.name("reg_email_confirmation__"));
		emailAddAconfirm.sendKeys("myemail@gmail.com");
		
		// Enter pass
		WebElement newPass = driver.findElement(By.id("password_step_input"));
		newPass.sendKeys("mYpAss*&$!");
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
