package flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginAndUpdateObjects;
import seleniumTraining.WikipediaObjects;

@Test
public class FlipkartTestCase {
	WebDriver driver;

	public void launchBrowser() throws AWTException, InterruptedException, IOException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		PageFactory.initElements(driver, FlipkartObjects.class);

		// search and launch Flipkart
		FlipkartObjects.searchFlipkart.sendKeys("flipkart");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		FlipkartObjects.flipkartHome.click();

		FlipkartObjects.closeBtn.click();
		// search redmi
		FlipkartObjects.flipkartSearch.sendKeys("redmi");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// switch to new window
		String oldWindow = driver.getWindowHandle();
		FlipkartObjects.selectPhone.click();
		Set<String> windows = driver.getWindowHandles();

		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);

		}
		// get price
		String price = FlipkartObjects.getPrice.getText();
		System.out.println("REDMI Note 11 SE price is " + price);

		// Take screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File saveFile = new File("/home/mahesh/Downloads/flipkart2.png");
		FileHandler.copy(sourceFile, saveFile);
		// get URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current URL is  " + currentUrl);
		driver.quit();

	}

	

}