package seleniumPracticePackage;

import org.openqa.selenium.By;

import utilities.Utils;

public class CssSelectorPractice extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("div[class=_6ltg]>a[role=button]")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("David");
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("input[type='text'][name='reg_email__']")).sendKeys("johndavid@gmail.com");
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("input[id='password_step_input']")). sendKeys("123456");	
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("select#month")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("select#month>option:nth-of-type(2)")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("select#day")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("select#day>option:first-child")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("select#year")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("select#year>option:nth-of-type(6)")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("input[type=radio][value='2']")).click();
		Utils.hardWait(2000);
		driver.findElement(By.cssSelector("button[type='submit'][name='websubmit']")).click();
		Utils.hardWait(2000);
	
		Utils.hardWait(6000);
		Utils.tearDown();
	}

}
