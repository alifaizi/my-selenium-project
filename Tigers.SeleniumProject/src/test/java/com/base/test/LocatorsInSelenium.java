package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LocatorsInSelenium extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/");
		
		// Finding element by xPath
		
		WebElement userName = driver.findElement(By.xpath("//a[@title='My Account']"));
		userName.click();
		
		// Finding element by linkText
		
		WebElement registration = driver.findElement(By.linkText("Register"));
		registration.click();
		
		// Finding element by cssSelector
		
		WebElement firstName = driver.findElement(By.cssSelector("input#input-firstname"));
		
		firstName.sendKeys("Ahmad");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		
		lastName.sendKeys("Mahmood");
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("ahmad@mahmood.com");
		
		WebElement phone = driver.findElement(By.id("input-telephone"));
		phone.sendKeys("202-234-2343");
		
		WebElement passWord = driver.findElement(By.cssSelector("#input-password"));
		passWord.sendKeys("abc123!");
		
		WebElement confirmPassWord = driver.findElement(By.cssSelector("input[name='confirm']"));
		confirmPassWord.sendKeys("abc123!");
		
		WebElement newsLetterYesRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @name='newsletter' and @value='1']"));
		newsLetterYesRadioButton.click();
		
		WebElement privacyPolicyCheckBox = driver.findElement(By.cssSelector("input[value=\"1\"][name=\"agree\"]"));
		privacyPolicyCheckBox.click();
		
		WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
		continueButton.click();
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

		
	}

}
