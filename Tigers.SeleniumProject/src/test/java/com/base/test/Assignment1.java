package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class Assignment1 extends BaseClass {

	public static void main(String[] args) {

//		Launch https://www.facebook.com/ 
//		Click on Create new account 
//		Enter First name 
//		Enter Last name 
//		Enter Mobile number or email 
//		Enter New password 
		
		BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Khan");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Jan");
		
		WebElement phoneEmail = driver.findElement(By.name("reg_email__"));
		phoneEmail.sendKeys("myemail@myemail.com");
		
		WebElement passWord = driver.findElement(By.id("password_step_input"));
		passWord.sendKeys("abc123xyz");		
		WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmEmail.sendKeys("myemail@myemail.com");
		
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByIndex(7);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select selectDay = new Select(day);
		selectDay.selectByValue("20");
		
		WebElement year = driver.findElement(By.cssSelector("select[title='Year']"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1978");
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name='sex'][@value='2']"));
		maleRadioButton.click();
		
		WebElement signUpButton = driver.findElement(By.name("websubmit"));
		
		signUpButton.click();
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
		
		
	}

}
