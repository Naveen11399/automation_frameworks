package flipkart;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

public class AmazonTC {
	WebDriver driver;

	@Test
	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.gecko.driver", "/home/mahesh/Downloads/selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
     // WebDriver d
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		PageFactory.initElements(driver, AmazonOBJ.class);

		AmazonOBJ.searchAmazon.sendKeys("amazon" + Keys.ENTER);
		// Actions action = new Actions(driver);
		// action.sendKeys(Keys.ENTER).build().perform();

		AmazonOBJ.amazonHome.click();
		AmazonOBJ.searchBox.sendKeys("flask" + Keys.ENTER);

		// action.sendKeys(Keys.ENTER).build().perform();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,800)", "");
		String oldWindow = driver.getWindowHandle();

		AmazonOBJ.selectFlask.click();

		Set<String> windows = driver.getWindowHandles();

		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);

		}

		String getTittle = AmazonOBJ.tittle.getText();
		System.out.println("flask name is  " + getTittle);
		String url = driver.getCurrentUrl();
		System.out.println("current url :" + url);

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File saveFile = new File("/home/mahesh/Downloads/flask.png");
		FileHandler.copy(sourceFile, saveFile);
		driver.quit();
	}

}
