package seleniumPracticePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenPageInNewTabByKeyDownAndKeyUp {
	
	public static void main(String[] args) {
		
		//Opening browser
		WebDriverManager.chromedriver().setup();
		
		//Creating new object of Chrome to load
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Opening the URL
		driver.get("https://www.facebook.com/");
		
		//Opening page in new tab
		WebElement CreatAPage = driver.findElement(By.linkText("Create a Page"));
		Actions acts = new Actions(driver);
		acts.moveToElement(CreatAPage).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		
		//Time to load page
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//time to load element on the web page
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		//Waiting until the page closes
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

