package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginAndUpdate {
	@Test
	public void login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
	WebDriver driver =new  ChromeDriver();
	driver.get("https://phptravels.net/login");
	driver.manage().window().maximize();
	PageFactory.initElements(driver, LoginAndUpdateObjects.class);
	LoginAndUpdateObjects.username.sendKeys("user@phptravels.com");
	LoginAndUpdateObjects.password.sendKeys("demouser");
	LoginAndUpdateObjects.login.click();
	Thread.sleep(5000);
	LoginAndUpdateObjects.myProfile.click();
	LoginAndUpdateObjects.state.sendKeys("tamilnadu");
	LoginAndUpdateObjects.city.sendKeys("cuddalore");
	LoginAndUpdateObjects.update.submit();

}
	}
