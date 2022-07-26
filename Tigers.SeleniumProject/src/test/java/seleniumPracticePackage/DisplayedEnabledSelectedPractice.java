package seleniumPracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class DisplayedEnabledSelectedPractice extends Utils{

		public static void main(String[] args) {

			Utils.getBrowser("chrome", "https://www.facebook.com/");
			
			WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		
			//isDisplayed();	
			boolean isDisplayed = createNewAccount.isDisplayed();
			
			System.out.println("Is displayed: " + isDisplayed);
			
			//isEnabled();
			boolean isEnabled = createNewAccount.isEnabled();
			System.out.println("Is enabled: " + isEnabled);
			
			//isSelected();
			createNewAccount.click();
			
			WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
			
//			boolean isSelected = createNewAccount.isSelected(); //false
//			System.out.println(isSelected);
//			gender.click();
//			
//			boolean isDisplayed2 = gender.isDisplayed();
//			System.out.println("Gender: isDisplayed = " + isDisplayed2);
//			boolean isEnabled2 = gender.isEnabled();
//			System.out.println("Gender: isEnabled = " + isEnabled2);
//			gender.click();
//			boolean isSelected2 = gender.isSelected();
//			System.out.println("Gender: isSelected = " + isSelected2); //true
					
// The above code is also correct
			
// Instead of above commented code we can use the following code too

			// We can create a method as bellow to check all conditions (isDisplayed();- isEnabled(); - isSlected();
			
			System.out.println(checkStatusOfRadioButton(gender));
			
			//clickOnRadioButtons(gender);
			
			
			// IF we want to checkStatusOfRadioButton and then click on the radio button, 
			//this is how we write our method in our test or pageObject class
			
			if(checkStatusOfRadioButton(gender) == true) {
				gender.click();
			}else {
				System.out.println("Return value was = false");
			}
	
			Utils.hardWait(4000);
			Utils.tearDown();
		}
			
//			public static void clickOnRadioButtons(WebElement element) {
//				
//			try {
//				if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
//					element.click();	
//					
//				}else {
//					
//					System.out.println("One of the conditions did not return the expected value");
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		}
//			
//			//Checking the status of radio button before clicking
//			
//			public static boolean checkStatusOfRadioButton(WebElement element) {
//				
//			try {
//				if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
//					
//					//return true;
//					
//					System.out.println("Radio button isDisplayed, isEnabled, and isSelected");
//					
//				}else {
//					
//					//return false;
//					
//					System.out.println("Checking status of radio button/checkbox failed");
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			return true;
//			
//		}

	}
