package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		//no of row and coloumn
		List <WebElement> coloumn=driver.findElements(By.tagName("th"));
		int coloumnSize =coloumn.size();
		System.out.println(coloumnSize);
		
		List <WebElement> row=driver.findElements(By.tagName("tr"));
		int rowSize =coloumn.size();
		System.out.println(rowSize);
		
		//
		//WebElement getprice=driver.findElement(By.xpath("//div[normalize-space()='Alden']//following::div[3]"));
		//String price= getprice.getText();
	//	System.out.println(price);
		

	}

}
