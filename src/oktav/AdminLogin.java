package oktav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
	
public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/admin");
	driver.manage().window().maximize();

	LoginPage login = new LoginPage(driver);
	login.typeUsername("admin");
	login.typePassword("admin@123");
	login.clickLoginBtn();
	
	String url = driver.getCurrentUrl();
	
	if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
		System.out.println("Admin Login Successfully");
		
	}
	else {
		System.out.println("Admin Failed to Login");
	}
	
	driver.close();

	}

}
