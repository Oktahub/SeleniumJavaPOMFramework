package oktav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.manage().window().maximize();

		LoginPage login = new LoginPage(driver);
		login.typeUsername("abcd");
		login.typePassword("xyz@123");
		login.clickLoginBtn();
		
		String error = login.captureErrorMsg();
		
		if(error.contains("Error: Invalid administrator login attempt.")) {
			System.out.println("Login Unsuccessfully and Error Message showed");
			
		}
		else {
			System.out.println("Login Successfully");
		}
		
		driver.close();

	}

}
