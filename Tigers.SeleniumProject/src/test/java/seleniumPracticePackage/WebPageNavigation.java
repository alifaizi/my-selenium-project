package seleniumPracticePackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageNavigation {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//Getting the title
		System.out.println(driver.getTitle());
		
		//Getting current URL
		
		System.out.println(driver.getCurrentUrl());
		
		
		//Opening a new web page
		
		driver.navigate().to("https://www.facebook.com");
		
		
		//Getting back to previous page 
		driver.navigate().to("http://automationpractice.com/index.php");
		
		
		
		//Navigate back
		driver.navigate().back();
		
	
		
		//Navigate forward
		driver.navigate().forward();
		
		//Refreshing the page
		driver.navigate().refresh();
		
		
		
		
		driver.quit();
		
	}

}
