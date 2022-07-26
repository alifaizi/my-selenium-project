package com.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class SubmitMethodAssignement extends BaseClass {

	public static void main(String[] args) {

		BaseClass.launchBrowser("chrome", "http://tek-school.com/retail/");
		
		WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
		myAccount.click();
		
		WebElement register = driver.findElement(By.xpath("//a[@title='My Account']/following-sibling::ul/child::li/child::a"));
		register.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("John");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Smith");
		
		WebElement emailAdd = driver.findElement(By.xpath("//input[@id='input-email']"));
		emailAdd.sendKeys("johnsmithjr@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
		phone.sendKeys("2023334444");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='input-password']"));
		passWord.sendKeys("abcxyz");
		
		WebElement passCofirm = driver.findElement(By.xpath("//input[@id='input-confirm']"));
		passCofirm.sendKeys("abcxyz");
		
		WebElement yesRadioBttn = driver.findElement(By.xpath("//input[@type='radio'][@name='newsletter'][@value='1']"));
		yesRadioBttn.click();
		
		WebElement privacyPolicyCheckBox = driver.findElement(By.xpath("//input[@type='checkbox'][@name='agree']"));
		privacyPolicyCheckBox.click();
		
		BaseClass.testExecutionWait(1000);
		
		WebElement continueBttn = driver.findElement(By.xpath("//input[@type='submit'][@class='btn btn-primary']"));
		//continueBttn.click();
		
		//Submit method --> to submit the form without clicking on the continue or sign up button
		privacyPolicyCheckBox.submit();
		
		BaseClass.testExecutionWait(6000);
		BaseClass.closeDown();

	}

	}
