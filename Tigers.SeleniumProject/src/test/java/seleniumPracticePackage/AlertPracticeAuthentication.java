package seleniumPracticePackage;

import utilities.Utils;

public class AlertPracticeAuthentication extends Utils {

	public static void main(String[] args) {

		//Authentication alert:
		//pass the username and password in the url
		
		//http://userName:password@the-internt.herokuapp.com/basic_auth/
		Utils.getBrowser("chrome", "https://admin:admin@the-internet.herokuapp.com/basic_auth/");
		
		
		
		Utils.hardWait(6000);
		Utils.tearDown();
		
	}

}
