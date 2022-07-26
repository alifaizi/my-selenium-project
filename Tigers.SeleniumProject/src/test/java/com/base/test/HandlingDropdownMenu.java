package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class HandlingDropdownMenu extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Ahmad");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Mahmodd");
		
		WebElement phoneEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phoneEmail.sendKeys("email@email.com");
		
		WebElement emailConfirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		emailConfirm.sendKeys("email@email.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passWord.sendKeys("123abcxyz");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//		Select selectMonth = new Select(month);
//		selectMonth.selectByVisibleText("Sep");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//		Select selectDay = new Select (day);
//		selectDay.selectByIndex(15);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
//		Select selectYear = new Select(year);
//		selectYear.selectByValue("1992");
		
		selectByValue(month, "Oct");
		selectByValue(day, "5");
		selectByValue(year, "1993");
		
		
		WebElement maleRadioButton = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]"));
		maleRadioButton.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submitButton.click();
		
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

		
	}

}
