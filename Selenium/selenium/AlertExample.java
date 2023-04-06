package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AlertExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/mahesh/Downloads/selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//alertBox
		WebElement alertBox=driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		Alert alertbutton=driver.switchTo().alert();
		alertbutton.accept();
		
		
		
		//confirmButton
		WebElement confirmbox=driver.findElement(By.id("j_idt88:j_idt93"));
		confirmbox.click();
		Alert confirmbutton=driver.switchTo().alert();
		confirmbutton.dismiss();
		
		
		
		//SweetALERT1
		WebElement sweetAlert=driver.findElement(By.id("j_idt88:j_idt95"));
		sweetAlert.click();
		//SweetAlertDismiss2
		WebElement disButton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		disButton.click();
		
		
		
		//SweetModalDialog1
		WebElement sweetModal =driver.findElement(By.id("j_idt88:j_idt100"));
		sweetModal.click();
		//sweetModalAlertDialog2
		WebElement modalSweet=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a"));
		modalSweet.submit();
		
		
		
		//promptDialog
		WebElement promptDialog=driver.findElement(By.id("j_idt88:j_idt104"));
		promptDialog.click();
		
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("naveen");
		promptAlert.accept();
		
		//SweetAlert
		WebElement YONalert=driver.findElement(By.id("j_idt88:j_idt106"));
		YONalert.click();
		//Alert YnAlert=driver.switchTo().alert();
		//YnAlert.dismiss();
	    WebElement YesButton=driver.findElement(By.id("j_idt88:j_idt108"));
	    YesButton.click();
	    
	    
	    //window max and min
	    
	    WebElement maxNmin=driver.findElement(By.id("j_idt88:j_idt111"));
	    maxNmin.click();
	    Thread.sleep(3000);
	    WebElement max=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[2]"));
	    max.click();
	    driver.quit();
		

	}
 
	
	
	
	
	
	
	
	
	
	
	
	
}
