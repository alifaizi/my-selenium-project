package labSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class DisplayedEnabledSelected extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "http://tek-school.com/retail/index.php?route=account/register");
		
		WebElement formHeader = driver.findElement(By.xpath("//h1[text()='Register Account']"));
		boolean isDisplayedText = formHeader.isDisplayed();
		System.out.println(isDisplayedText);
		
		
		WebElement fName = driver.findElement(By.xpath("//form[@class='form-horizontal']//descendant::input[@id='input-firstname']"));
		
		boolean blbIsDisplayed = fName.isDisplayed();
		System.out.println(blbIsDisplayed);
		
		boolean blbIsEnabled = fName.isDisplayed();
		System.out.println(blbIsEnabled);
		
		
		//Radio Button
		WebElement radioBttn = driver.findElement(By.xpath("//div[@class='col-sm-10']//label[2]//input"));
		if ( radioBttn.isDisplayed() == true && radioBttn.isDisplayed() == true && radioBttn.isSelected() == true) {
			radioBttn.click();
			System.out.println("Radio button was already selected");
		}else {
			System.out.println("Radio button was not selected! or Displayed! of Enabled");
		}
	
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
