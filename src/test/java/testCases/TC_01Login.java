package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.TestBase;

public class TC_01Login extends TestBase {
	
	@Test  
	public void login() {
              LoginPage page = new LoginPage(driver);
              page.enteruser("Admin");
              page.enterpass("admin123");
              page.click();
	}
@Test  
	public void verifyURL() {
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		assertEquals(driver.getCurrentUrl(), expectedURL);
		System.out.println("Login Successfull");
	}
	
}
