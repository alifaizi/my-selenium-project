package seleniumPracticePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class PracticeWithSearchField extends Utils{

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://ebay.com");
		WebElement text = driver.findElement(By.linkText("Electronics"));
		String strText = text.getText();
		
		Utils.hardWait(2000);
		driver.navigate().to("https://www.amazon.com/");
		
		Utils.hardWait(2000);
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys(strText);
		
		Utils.hardWait(2000);
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}
}