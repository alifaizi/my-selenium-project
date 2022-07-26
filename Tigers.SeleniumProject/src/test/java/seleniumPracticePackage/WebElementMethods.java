package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class WebElementMethods extends Utils{

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		
		WebElement phoneEmail = driver.findElement(By.id("email"));
		
		phoneEmail.sendKeys("566-777-8980");
		
		Utils.hardWait(2000);
		
		//clear();
		phoneEmail.clear();
		
		Utils.hardWait(1000);
		
		phoneEmail.sendKeys("email@gmail.com");
		
		//getTagName();
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		System.out.println(createNewAccount.getTagName());
		
		//getText();
		System.out.println(createNewAccount.getText());
		
		//getCSS Value
		WebElement bgColor = driver.findElement(By.linkText("Create new account"));
		System.out.println(bgColor.getCssValue("background-color"));
		System.out.println(bgColor.getCssValue("font-size"));
		
		//getAttribute();
		System.out.println("getAttribute: " + createNewAccount.getAttribute("data-testid"));
		
		//getSize();
		System.out.println("Size: " + createNewAccount.getSize());
		
		//getLocation();
		System.out.println("Location: " + createNewAccount.getLocation());
		
		
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
	}

}
