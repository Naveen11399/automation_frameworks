package flipkart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DemoTestCase {
//	WebDriver driver;
	@Test
	public void launchBrowser() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/mahesh/Downloads/selenium/geckodriver");
		WebDriver driver= new FirefoxDriver();
	   	driver.get("https://www.google.com");
		//driver=new  ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://demo.guru99.com");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		PageFactory.initElements(driver, demoGuruOBJ.class);
		//reg
		demoGuruOBJ.customerId.click();
		Thread.sleep(3000);
		demoGuruOBJ.customerId.sendKeys("na@gmail.com");
		demoGuruOBJ.submit.click();

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File saveFile = new File("/home/mahesh/Downloads/demoguru1.png");
		FileHandler.copy(sourceFile, saveFile);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		demoGuruOBJ.bankProject.click();
		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		File sourceFile1 = screenshot.getScreenshotAs(OutputType.FILE);
		File saveFile1 = new File("/home/mahesh/Downloads/bankProject.png");
		FileHandler.copy(sourceFile1, saveFile1);
		driver.quit();
		
	}

}
