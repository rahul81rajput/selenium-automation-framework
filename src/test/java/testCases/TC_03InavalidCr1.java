package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.TestBase;

public class TC_03InavalidCr1 extends TestBase {
        @Test
	public void InvalidCr1() {
		
		LoginPage page = new LoginPage(driver);
		page.enteruser("fdfcfc");
		page.enterpass("123432");
		page.click();
		Assert.assertTrue(page.invalid());
		System.out.println("Invalid");
	}
	
}
