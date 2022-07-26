package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class SelectClassInSelnium extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		selectMonthFromDropDown(9);
		System.out.println(getTheSelectedMonth(9));
		selectDayFromDropDown(4);
		System.out.println(getTheSelectedDay(4));
		selectYearhFromDropDown(36);
		System.out.println(getTheSelectedYear(36));

		Utils.hardWait(6000);
		Utils.tearDown();
	}
	public static void selectMonthFromDropDown(int index) {
		Select select = new Select(driver.findElement(By.cssSelector("select#month")));
		select.selectByIndex(index);
	}
	public static void selectDayFromDropDown(int index) {
		Select select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByIndex(index);
	}
	public static void selectYearhFromDropDown(int index) {
		Select select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByIndex(index);
	}
	public static String getTheSelectedMonth(int index) {
		WebElement monthText = driver.findElement(By.xpath("//select[@id='month']//option[" + (index + 1) + "]"));
		String strMonth = monthText.getText();
		return strMonth;
	}
	public static String getTheSelectedDay(int index) {
		WebElement monthText = driver.findElement(By.xpath("//select[@id='day']//option[" + (index + 1) + "]"));
		String strMonth = monthText.getText();
		return strMonth;
	}
	public static String getTheSelectedYear(int index) {
		WebElement monthText = driver.findElement(By.xpath("//select[@id='year']//option[" + (index + 1) + "]"));
		String strMonth = monthText.getText();
		return strMonth;
	}

}
