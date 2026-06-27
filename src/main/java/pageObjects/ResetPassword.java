package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword extends PageBase{
	
	public ResetPassword(WebDriver driver) {
		super(driver);
	}
	
	private By username= By.xpath("//input[@name='username']");
	private By resetPassword = By.xpath("//button[text()=' Reset Password ']");
	private By show=By.xpath("//h6[text()='Reset Password']");
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void clickResetPassword() {
	driver.findElement(resetPassword).click();	
	}
	public boolean isResetPasswordPageDisplayed() {
		return driver.findElement(show).isDisplayed();
	}
	
}
