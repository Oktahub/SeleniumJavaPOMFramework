package oktav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redirect {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.manage().window().maximize();

		LoginPage redirect = new LoginPage(driver);
		redirect.typeUsername("admin");
		redirect.typePassword("admin@123");
		redirect.clickLoginBtn();
		Thread.sleep(3000);
		redirect.clickLink();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://www.gcrit.com/build3")) {
			System.out.println("Redirecting Page from Admin to User Interface Successfully");
			
		}
		else {
			System.out.println("Not Redirecting Page from Admin to User Interface");
		}
		
		driver.close();

	}

}
