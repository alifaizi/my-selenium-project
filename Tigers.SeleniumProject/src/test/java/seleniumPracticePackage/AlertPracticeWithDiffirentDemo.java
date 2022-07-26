package seleniumPracticePackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertPracticeWithDiffirentDemo extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://demo.guru99.com/test/delete_customer.php");
		WebElement textField = driver.findElement(By.cssSelector("input[name=cusid"));

		textField.sendKeys("444");

		WebElement submitButton = driver.findElement(By.cssSelector("input[name=submit"));

		submitButton.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
