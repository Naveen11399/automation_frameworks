package TestCases;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utils.Helper;
import Utils.ReadConfig;
import pageObjects.AdminLogin;
import pageObjects.ElectronicsOBJ;
import pageObjects.HomeFurnitureOBJ;
import pageObjects.KrishnaProductOBJ;
import pageObjects.LoginPage;
import pageObjects.SportsOBJ;
import pageObjects.StoreContactOBJ;
import pageObjects.StoreHomeOBJ;
import pageObjects.StoreMenuOBJ;
import pageObjects.WomensFashionOBJ;

public class BaseClass {
	public static WebDriver driver;
	ReadConfig rc= new ReadConfig();
	public String basUrl=rc.getURL();
	public String uName=rc.getUserName();
	public String pwd=rc.getPwd();
	public	String adminURL=rc.getAdminUrl();
	public	String adminUname=rc.getAdminUname();
	public	String adminPword=rc.getAdminPword();
	public LoginPage lp;
	public static Logger logger;
	public ElectronicsOBJ ele;
	public static ExtentReports er;
	public static ExtentTest et;
	public Actions act;
	public SportsOBJ sp;
	public KrishnaProductOBJ kp;
	public WebDriverWait wt;
	public WomensFashionOBJ wp;
	public StoreHomeOBJ sh;
	public HomeFurnitureOBJ hf;
	//public AdminLogin ap;
	public StoreMenuOBJ sm;
//	public CatalogPage cp;
	//public BlackTshirtOBJ bp;
	public StoreContactOBJ sc;
	
	
	@BeforeSuite
	public void extentRep() {
		
		
		ExtentHtmlReporter html=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/report/spurtReport"+Helper.getTime()+".html"));
		er=new ExtentReports();
		er.attachReporter(html);
	}
	
	@AfterMethod
	public void report(ITestResult result) throws IOException {
		 if (result.getStatus()==ITestResult.FAILURE) {
			 et.fail("Test case failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.screenShot(driver)).build());
			 
		 }
		 else if(result.getStatus()==ITestResult.SUCCESS) {
			 et.pass("Test case passed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.screenShot(driver)).build());
			 
		 }
		
		
		
		er.flush();
	}
	
	
	
	
	
//	@AfterClass
//	public void tearDown() {
//		
//		
//		
//		driver.quit();
//	}
	
	
	public  void caputureScreen(WebDriver driver,String Name) throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshots/"+Name+".png");
		FileUtils.copyFile(source,target);
		System.out.println("screenshot taken");
		}
	
	public void waitTimeMin() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public void waitTime() throws InterruptedException {
		Thread.sleep(6000);
	}
	
	public void waitTimeMax() throws InterruptedException {
		Thread.sleep(15000);
	}
	
	public void scrollDown() {
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

public void adminLogin() {
	driver.get(adminURL);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		

}
public void storeLogin() {
	driver.get(basUrl);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
		

}

	//@BeforeMethod

//public void adminloginSetUp() {
//	ap=new AdminLogin(driver);
//	ap.UName(adminUname);
//	ap.pWord(adminPword);
//	ap.login();
//}
	public void loginSetUp() {
		lp=new LoginPage(driver);
		lp.signInbtn();
		lp.UName(uName);
		lp.pWord(pwd);
		lp.login();
	}
	
	
	@BeforeClass
	public void launchBrowser() {
		
		logger=Logger.getLogger("spurtStore");
		PropertyConfigurator.configure("log4j.properties");
		
		if (rc.getBrowser().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",rc.getChromePath() );
			 driver = new ChromeDriver();
		}
		else if (rc.getBrowser().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",rc.getFireFoxPath() );
			 driver = new FirefoxDriver();
		}
		else if (rc.getBrowser().equals("edge")) {
			System.setProperty("webdriver.edge.driver",rc.getEdgePath() );
			 driver = new EdgeDriver();
		}
		
		 
		
		driver.get(basUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public WebElement useEW(WebElement ele) {
	 wt.until(ExpectedConditions.visibilityOf(ele));
	 return ele;
	}
	
	
	@SuppressWarnings("static-access")
	public String VerifyOrder() {
		
			 
		try {
			String 	 actStatus=ele.orderPlaced.getText();
				 System.out.println(actStatus);
				return actStatus;
		} 
		catch (Exception e) {
			String 	actStatus=ele.orderOutOfStock.getText();
			 System.out.println(actStatus);
			return actStatus;
			
		}
	
		
		
		
		
	}
	
	
}
