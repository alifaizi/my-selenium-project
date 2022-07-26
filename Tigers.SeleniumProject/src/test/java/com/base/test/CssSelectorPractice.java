package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class CssSelectorPractice extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("div[class='_6ltg']>a[role='button']")).click();
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Joseph");
		
		driver.findElement(By.cssSelector("div>input[name='lastname']")).sendKeys("Ryan");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("email@email.com");
		
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("abc123xyz");
		
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		WebElement day = driver.findElement(By.cssSelector("select#day"));
		WebElement year = driver.findElement(By.cssSelector("select#year"));
		selectByValue(month, "Jul");
		selectByValue(day, "9");
		selectByValue(year, "1993");
		
		driver.findElement(By.cssSelector("input[type=radio][value='2']")).click();
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();
	}

}
