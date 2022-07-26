package seleniumPracticePackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertOkConceledSendKeys extends Utils {

	public static void main(String[] args) {


				Utils.getBrowser("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				WebElement iFrame = driver.findElement(By.xpath("//div[@id='iframe']//div[@id='iframewrapper']//iframe"));
				driver.switchTo().frame(iFrame);
				
				WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
				tryIt.click();

				Utils.hardWait(1000);
				
				Alert alert = driver.switchTo().alert();
				
				alert.sendKeys("Tigers");
				
//				alert.accept();
				
				alert.dismiss();

				
			
				Utils.hardWait(6000);
				Utils.tearDown();
				
			}

		}
