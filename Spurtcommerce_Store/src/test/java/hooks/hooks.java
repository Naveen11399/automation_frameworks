package hooks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginFunctionOBJ;
import Utils.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {

	ReadConfig rc = new ReadConfig();
	String StoreUrl = rc.storeUrl();
	String StoreUName = rc.storeUname();
	String StorePwd = rc.storePwd();

	public static WebDriver driver;
	public static Logger logger;
	public LoginFunctionOBJ lp;

	@Before(order = 0)
	public void SetUpBrowser() {
		logger = Logger.getLogger("Spurtcommerce_Store");
		PropertyConfigurator.configure("log4j.properties");

		if (rc.getBrowser().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (rc.getBrowser().equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else if (rc.getBrowser().equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		
		driver.get(StoreUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	
	
	public void login() {
	lp=new 	LoginFunctionOBJ(driver);
	
	lp.signInbtn();
	lp.UName(StoreUName);
	lp.pWord(StorePwd);
	lp.signInbtn();
	}
	
	@After
	public void tearDown() {

		driver.quit();
	}
	
	public static void waitTimeMin() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void waitTime() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void waitTimeMax() throws InterruptedException {
		Thread.sleep(9000);
	}
	
	public static void scrollDown() {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,600)");
	}
	public void scrollDownMin() {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,800)");
	}
	
	public void scrollUp() {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,-800)");
	}
	
	public void scrollBottom() {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public static void caputureScreen(WebDriver driver,String Name) throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshots/"+Name+".png");
		FileUtils.copyFile(source,target);
		System.out.println("screenshot taken");
		}

}
