package seleniumPracticePackage;

import org.openqa.selenium.JavascriptExecutor;

import utilities.Utils;

public class JSExecutor_Alert extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + " Welcome to Tek-School Retail Page! " + "')");
		Utils.hardWait(2000);
		driver.switchTo().alert().accept();

		js.executeScript("Confirm('Are you sure you want to delete this file')");
		Utils.hardWait(2000);
		driver.switchTo().alert().accept();

		js.executeScript("prompt('Enter your password!')");
		Utils.hardWait(2000);
		driver.switchTo().alert().accept();

		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
