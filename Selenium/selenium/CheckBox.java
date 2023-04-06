package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//basic 
		WebElement basic=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span"));
		basic.click();
		
		WebElement notification=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/span"));
		notification.click();
		//multiSelect
		WebElement multiSelect=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/label"));
		multiSelect.click();
		WebElement multiSelect1=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/label"));
		multiSelect1.click();
		
		//triStateCheckBox
		WebElement triState=driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]"));
		triState.click();
		triState.click();
		
		//toggle
		WebElement toggle=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]"));
		toggle.click();
		
		//DisableBox
		WebElement Box=driver.findElement(By.id("j_idt87:j_idt102"));
		
		boolean disableButton= Box.isEnabled();
		System.out.println("Disable button is disabled...?"+disableButton);
		
		WebElement boxOpen=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[3]"));
		boxOpen.click();
		WebElement multi1=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]/div/div[2]"));
		multi1.click();
		WebElement multi2=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[5]/div"));
		multi2.click();
		WebElement boxOpen1=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[3]"));
		boxOpen1.click();
		
	  
	}
}
