package seleniumPRACTICE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Spurt {
	@Test
	public void addVendor() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Picco\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.6.249.0/admin/#/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		PageFactory.initElements(driver, SpurtTab.class);
		SpurtTab.userName.sendKeys("marketplace@spurtcart.com");
		SpurtTab.password.sendKeys("marketplace123$");
		SpurtTab.login.submit();

		//add product
		SpurtTab.marketplace.click();	
		SpurtTab.addVendor.click();
		SpurtTab.companyName.sendKeys("trendz");
		SpurtTab.vendorDrp.sendKeys("dress group"+Keys.ENTER);
		SpurtTab.dispName.sendKeys("hoodie");
		SpurtTab.firstName.sendKeys("naveen");
		SpurtTab.lastName.sendKeys("kumar");
		SpurtTab.email.sendKeys("naveen138@gmail.com");
		SpurtTab.MobNumber.sendKeys("7538880402");
		SpurtTab.address1.sendKeys("north street");
		SpurtTab.address2.sendKeys("plk");
		SpurtTab.city.sendKeys("cuddalore");
		
		//SpurtTab.state.click();
		SpurtTab.state.sendKeys("kerala"+Keys.ENTER);
		//SpurtTab.country.click();
		SpurtTab.country.sendKeys("pakistan"+Keys.ENTER);
		SpurtTab.postalCode.sendKeys("608701");
		SpurtTab.password.sendKeys("Naveen@11");
		SpurtTab.cnfmPwd.sendKeys("Naveen@11");
		
		SpurtTab.bankDetails.sendKeys("sbi 32526954 sbin006400");
		//Thread.sleep(3000);
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
	//scroll1.executeScript("window.scrollBy(0,500)");
	//Thread.sleep(3000);
	/*	SpurtTab.uploadImg.click();
		//WebDriverWait wait=WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("ap-upload-image")));
		
		
		String file="C:\\Users\\Picco\\Pictures\\tommy";
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		Thread.sleep(3000);
		SpurtTab.createBtn.click();
		//driver.quit();
	}

	}