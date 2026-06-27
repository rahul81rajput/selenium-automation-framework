package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By Logout = By.xpath("//p[text()='manda user']");
	private By Log=By.partialLinkText("Logout");
	public void logout() {
		driver.findElement(Logout).click();
	}
	public void log() {
		driver.findElement(Log).click();
	}
	
}
