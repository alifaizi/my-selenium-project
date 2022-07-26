package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class LocatorsPractice extends Utils{

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		
		//tag name
		
		WebElement textFiled = driver.findElement(By.tagName("h2"));
		String strText = textFiled.getText();
		System.out.println(strText);
		
		// ID 
		
		WebElement passField = driver.findElement(By.id("pass"));
		passField.sendKeys("12345");
		
		String [] passwordArray = {"12345"};
		passField.sendKeys(passwordArray);
		
		// Name
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("emailField@gmail.com");
		
		// Class name
		
		WebElement textField2 = driver.findElement(By.className("_8esh"));
		System.out.println(textField2.getText());
		
		// Link Text
		
		WebElement createAPage = driver.findElement(By.linkText("Creat a Page"));
		createAPage.click();
		driver.navigate().back();
		
		// Partial Link Text
		
		WebElement forgotPass = driver.findElement(By.partialLinkText("got pass"));
		forgotPass.click();
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
