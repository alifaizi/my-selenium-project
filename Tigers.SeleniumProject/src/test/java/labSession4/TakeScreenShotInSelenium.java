package labSession4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.Utils;

public class TakeScreenShotInSelenium extends Utils{

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");
		
		// We need to giver out screenshot a name
		// We need to specify and address for screenshot to be stored 
		// We have create object of File class and type cost our WebDriver to TakeScreenshot interface
		// Then use the getScreenshotAs() method from selenium and pass OutputType.FILE 
		// It means we want the screenshot as output type file.
		// FileUtils class which is coming from commons.io and use the copyFile() method so that everytime we take a
		// screenshot it is dealt with as new file and then pass the path to where we are storing the screenshot, the file name
		// and it should enable us to take screenshot and store it with name we give in the location we specified in our computer.
		
				
		String screenshotName = "tek-school Retail"; 
		
		String path = ".\\screenshots\\"; // two \\ prevents the path name to be mixed with file name
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(path + screenshotName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		hardWait(6000);
		tearDown();
	}

}
