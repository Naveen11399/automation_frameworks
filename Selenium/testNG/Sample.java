package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class Sample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchTheBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		 driver =new  ChromeDriver();
		
		
	}
	@Test(priority=0)
	public void openTwitter() {
		driver.get("https://twitter.com");
	}
	@Test(dependsOnMethods = "openTwitter",enabled = true)
	public void openInsta() {
		driver.get("https://instagram.com");
	}
	@Test(dependsOnMethods = "openInsta")
	public void openFB() {
		
		driver.get("https://facebook.com");
	}
	@AfterSuite
	public void closeTheBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("totalTime taken is"+totalTime);
		
	}
	
}
