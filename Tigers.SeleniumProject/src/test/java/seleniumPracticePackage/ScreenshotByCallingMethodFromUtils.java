package seleniumPracticePackage;

import java.io.IOException;

import utilities.Utils;

public class ScreenshotByCallingMethodFromUtils extends Utils{

	public static void main(String[] args) throws IOException {
		
		getBrowser("chrome", "http://tek-school.com/retail/");
		takeScreenshot("test2");
		
		
		
		
		hardWait(6000);
		tearDown();
	}

}
