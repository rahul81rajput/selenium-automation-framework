package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.TestBase;

public class TC_02Logout extends TC_01Login{
@Test
	public void logout() {
		HomePage page = new HomePage(driver);
		page.logout();
		page.log();
		System.out.println("Logout Successfull");
	}
	
}
