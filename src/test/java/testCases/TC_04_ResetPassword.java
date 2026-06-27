package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.ResetPassword;
import testBase.TestBase;

public class TC_04_ResetPassword extends TestBase {
	
	@Test
	public void resetPassword() {
		LoginPage page =new LoginPage(driver);
		page.resetPassword();
		
		ResetPassword reset =new ResetPassword(driver);
		
		Assert.assertTrue(reset.isResetPasswordPageDisplayed());
		System.out.println("Yes show");
		reset.enterusername("Admin");
		reset.clickResetPassword();
		
		
	}
	
	

}
