package seleniumPRACTICE;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SpurtTC {
	// static Logger logger=Logger.getLogger(SpurtTC.class);
	//WebDriver	driver;
	private Duration timeoutInSeconds;
	@Test
	public void addProduct() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Picco\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		PageFactory.initElements(driver, SpurtOBJ.class);
		//login
		SpurtOBJ.userName.sendKeys("marketplace@spurtcart.com");
		SpurtOBJ.password.sendKeys("marketplace123$");
		SpurtOBJ.login.submit();

		//add product
		SpurtOBJ.catalog.click();

		SpurtOBJ.addProduct.click();

		SpurtOBJ.productName.sendKeys("redmi note9 pro max");

		SpurtOBJ.skuNumber.sendKeys("mi9");

		driver.switchTo().frame(0);

		SpurtOBJ.description.sendKeys("smartphone");

		//SpurtOBJ.description.submit();
		driver.switchTo().defaultContent();

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");	

		Thread.sleep(2000);

		SpurtOBJ.data.click();

		SpurtOBJ.quantity.sendKeys("10");
		SpurtOBJ.status.click();

		List<WebElement>options1=SpurtOBJ.enabled.findElements(By.xpath("//div[@class=\"ng-dropdown-panel-items scroll-host\"]"));
		options1.get(0).click();

		//Select select =new Select(SpurtOBJ.enabled);
		//select.selectByValue("Enabled");
		SpurtOBJ.calendar.click();

		SpurtOBJ.nxtMonthBtn.click();
		SpurtOBJ.date.click();
		SpurtOBJ.sortOrder.sendKeys("1");
		SpurtOBJ.images.click();
		Thread.sleep(3000);
		SpurtOBJ.addImage.click();
		SpurtOBJ.uploadImg.click();
		SpurtOBJ.insertBtn.click();
		SpurtOBJ.price.click();
		SpurtOBJ.defalutPrice.click();
		SpurtOBJ.productCost.sendKeys("500");
		SpurtOBJ.value.click();
		SpurtOBJ.value.sendKeys("50");
		SpurtOBJ.category.click();
		SpurtOBJ.searchCategory.click();
		SpurtOBJ.searchCategory.sendKeys("dress");
		List<WebElement>options=SpurtOBJ.selectCategory.findElements(By.xpath("//li[@style=\"cursor: pointer;\"]"));
		options.get(2).click();
		//Thread.sleep(3000);
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(3000);
		SpurtOBJ.saveProduct.click();
		driver.quit();
	}


}
