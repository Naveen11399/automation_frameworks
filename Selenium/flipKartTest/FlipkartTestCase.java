package flipKartTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import flipkart.AmazonOBJ;

public class FlipkartTestCase {
	WebDriver driver;

	@Test
	public void flipkartGrocery() throws InterruptedException, IOException {

		 System.setProperty("webdriver.gecko.driver",
		 "/home/mahesh/Downloads/selenium/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		PageFactory.initElements(driver, FlipkartElemnts.class);
		FlipkartElemnts.searchFlipkart.sendKeys("flipkart" + Keys.ENTER);

		// Actions action = new Actions(driver);
		// action.sendKeys(Keys.ENTER).build().perform();

		FlipkartElemnts.flipkartHome.click();

		FlipkartElemnts.closeBtn.click();

		FlipkartElemnts.viewCart.click();
		Thread.sleep(2000);

		FlipkartElemnts.groceryBtn.click();

		String groceryLists = FlipkartElemnts.groceryList.getText();

		System.out.println("grocery list : " + groceryLists);

		FlipkartElemnts.shopNow.click();

		Thread.sleep(3000);

		Thread.sleep(3000);
		FlipkartElemnts.allow.sendKeys("600042");

		FlipkartElemnts.allow.submit();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		FlipkartElemnts.telephone.click();
		Thread.sleep(3000);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File saveFile = new File("/home/mahesh/Downloads/phoneNumber.png");
		FileHandler.copy(sourceFile, saveFile);
		String url = driver.getCurrentUrl();
		System.out.println("current url :  " + url);

		driver.quit();

	}

}
