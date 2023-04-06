package pOMFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
@Test
public class CommonObjects {

	public static WebDriver driver=null;
	public static Properties properties=null;

	public  Properties propertyFile() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("config_Properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		return properties;
	}
	@BeforeSuite
	public void launchBrowser() throws IOException {

		propertyFile();
		String browser=properties.getProperty("chrome");
		String url=properties.getProperty("url");
		String driverLocation=properties.getProperty("DriverLocation");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver =new  ChromeDriver();
			driver.get("url");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		else {
			System.setProperty("webdriver.gecko.driver", "/home/mahesh/Downloads/selenium/geckodriver");
			driver =new  FirefoxDriver();
			driver.get("url");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}

	}
	





}

