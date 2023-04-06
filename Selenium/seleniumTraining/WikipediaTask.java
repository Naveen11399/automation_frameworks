package seleniumTraining;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WikipediaTask {
	@Test
	public void wiki() throws IOException {
		System.setProperty("webdriver.edge.driver", "/home/mahesh/Downloads/selenium/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");

		PageFactory.initElements(driver, WikipediaObjects.class);
		// search The Wikipedia
		System.out.println("search The Wikipedia");
		WikipediaObjects.search_Wikipedia.sendKeys("wikipedia");
		WikipediaObjects.search_Wikipedia.submit();
		
		// Switch to new Window
		String oldWindow = driver.getWindowHandle();
		WikipediaObjects.go_To_The_WikipediaPage.click();
		Set<String> windows = driver.getWindowHandles();

		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);

		}
		// search The HealthCare
		System.out.println("search The HealthCare");
		WikipediaObjects.search_The_HealthCare.sendKeys("healthcare");
		WikipediaObjects.search_The_HealthCare.submit();

		// click the secondaryCare
		System.out.println("click the secondaryCare");
		WikipediaObjects.go_TO_SecondaryCare.click();

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File saveFile = new File("/home/mahesh/Downloads/sample145.png");
		FileHandler.copy(sourceFile, saveFile);
		driver.quit();
	}

}
