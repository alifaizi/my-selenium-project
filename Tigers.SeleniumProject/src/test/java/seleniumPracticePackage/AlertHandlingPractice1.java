package seleniumPracticePackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertHandlingPractice1 extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
		
		WebElement iFrame = driver.findElement(By.xpath("//div[@id='iframe']//div[@id='iframewrapper']//iframe"));
		driver.switchTo().frame(iFrame);
		
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();
		
		//Utils.hardWait(2000);
		
//		First we have to create an object of Alert class from Selenium and switch to the alert using the referecne
//		to WebDriver object reference and the call the switchTo() method and then alert()
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//driver.switchTo().defaultContent();
		
		WebElement button = driver.findElement(By.xpath("//button[@id='runbbtn']"));
		System.out.println(button.getText());
		
	
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
