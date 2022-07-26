package com.base.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class testDropDownMenu extends BaseClass {
	
	public static void main(String[] args) {
	
	BaseClass.launchBrowser("chrome", "https://www.wikipedia.org/");
	
	//Clicking on drop down menu
	WebElement dropDownMenu = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
	dropDownMenu.click();
	
	//Selecting a specific language
	Select select = new Select(dropDownMenu);
	select.selectByValue("fa");
	
	//Printing the number of element in the drop down menu
	List<WebElement> options = select.getOptions();
	System.out.println(options.size());
	
	System.out.println("-------------------");
	
	//Printing all elements in the drop down menu
	for (int i = 0; i < options.size(); i++) {
		System.out.println(options.get(i).getText());
		
	}

	BaseClass.testExecutionWait(4000);
	BaseClass.closeDown();
}
}
