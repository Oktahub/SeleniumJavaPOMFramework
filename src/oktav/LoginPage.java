package oktav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By User = By.name("username");
	By Pass = By.name("password");
	By LoginBtn = By.id("tdb1");
	By ErrorMsg = By.className("messageStackError");
	By CatalogLink = By.linkText("Online Catalog");
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUsername (String Uname) {
		driver.findElement(User).sendKeys(Uname);
	}
	
	public void typePassword (String Password) {
		driver.findElement(Pass).sendKeys(Password);
	}
	
	public void clickLoginBtn () {
		driver.findElement(LoginBtn).click();
	}
	
	public String captureErrorMsg () {
		String message = driver.findElement(ErrorMsg).getText();
		return message;
	}
	
	public void clickLink () {
		driver.findElement(CatalogLink).click();
	}

}
