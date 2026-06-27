package pageObjects;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	private By username = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("//button[@type='submit']");
	private By invalid = By.xpath("//p[text()='Invalid credentials']");
	private By resetPassword=By.xpath("//p[text()='Forgot your password? ']");
	
	
	public void enteruser(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void enterpass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void click() {
		driver.findElement(login).click();
	}
	
	public boolean invalid() {
		
		return driver.findElement(invalid).isDisplayed();
	}
	public void resetPassword() {
		driver.findElement(resetPassword).click();
	}
	
	
}
