package seleniumPracticePackage;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utilities.Utils;

public class Assertion_ValidateArrayList extends Utils {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		// Hard assert and validating to see if both list 1 and list 2 are holding same values
		// to add hard assert, we can just add the assertion using the Assert class and then call 
		// the assert methods
		// Since we are using testNG Assertion, we have to make sure to import the right assertion 
		// and the import line is our class should be = import org.testng.Assert;
		Assert.assertEquals(list1, list2);
		System.out.println("Line after hard assertion!");
		
		
		//To use soft assert, first we need to create object of SoftAssert class and then use 
		// the reference to SfotAssert class object and access assertion methods
		
		// Since we are using testNG Assertion, we have to make sure to import the right assertion 
		// and the import line is our class should be = import org.testng.asserts.SoftAssert;
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(list1, list2);
		
		System.out.println("Line after hard assertion!");
	
		

	}

}
