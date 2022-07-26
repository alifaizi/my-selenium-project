package seleniumPracticePackage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.Utils;

public class FullPageScrrenshotPractice extends Utils {

	public static void main(String[] args) throws IOException {
		
		getBrowser("chrome", "https://demo.nopcommerce.com/");
		
		//Full page screenshot
		
		String screenshotPath = ".\\screenshots\\";
		String screenshotName = "Full page screenshot";
		Screenshot fullPageScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(fullPageScreenshot.getImage(), "PNG", new File(screenshotPath + screenshotName + ".png"));
		
		
		//First half page screenshot
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File srcFile = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File (".\\screenshots\\homepage.png");
//		FileUtils.copyFile(srcFile, target);
		
		
		// Portion of the page screenshot
		
//		WebElement specificSection = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File srcFile = specificSection.getScreenshotAs(OutputType.FILE);
//		File target = new File (".\\screenshots\\FeaturedProducts.png");
//		FileUtils.copyFile(srcFile, target);
		
		
		// One element screenshot
		
//		WebElement specificElement = driver.findElement(By.xpath("(//img[@alt='nopCommerce demo store'])[1]"));
//		File srcFile = specificElement.getScreenshotAs(OutputType.FILE);
//		File target = new File (".\\screenshots\\Logo Screenshot.png");
//		FileUtils.copyFile(srcFile, target);
		
		hardWait(6000);
		tearDown();

		
	}

}
